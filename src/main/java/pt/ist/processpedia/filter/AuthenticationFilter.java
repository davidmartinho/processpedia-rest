package pt.ist.processpedia.filter;

import com.sun.jersey.core.util.Base64;
import java.io.IOException;
import java.security.Principal;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import pt.ist.processpedia.domain.Processpedia;
import pt.ist.fenixframework.FenixFramework;
import pt.ist.processpedia.domain.User;
import pt.ist.processpedia.exception.UserNotAuthorizedException;

public class AuthenticationFilter implements Filter {

    private class AuthenticatedRequestWrapper extends HttpServletRequestWrapper {

        private String username;

        public AuthenticatedRequestWrapper(HttpServletRequest request, String username) {
            super(request);
            this.username = username;
        }

        @Override
        public Principal getUserPrincipal() {
            return new Principal() {
                @Override
                public String getName() {
                return username;
                }
            };
        }
    }

    public void init(FilterConfig filterConfig) throws ServletException {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        String authHeader = httpServletRequest.getHeader(HttpHeaders.AUTHORIZATION);
        if(authHeader == null) {
            throw new UserNotAuthorizedException();
        }
        String auth = authHeader.substring(SecurityContext.BASIC_AUTH.length());
        String[] values = Base64.base64Decode(auth).split(":");

        String username = values[0];
        String password = values[1];

        User user = ((Processpedia)FenixFramework.getRoot()).login(username, password);
        if(user==null) {
            throw new UserNotAuthorizedException();
        }
        chain.doFilter(new AuthenticatedRequestWrapper((HttpServletRequest)request, user.getExternalId()), response);


    }

    public void destroy() {}



}
