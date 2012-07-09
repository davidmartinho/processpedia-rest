package pt.ist.processpedia.filter;

import pt.ist.processpedia.util.Bootstrap;
import java.io.IOException;
import javax.servlet.*;
import pt.ist.fenixframework.pstm.Transaction;

public class TransactionFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Bootstrap.run();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        Transaction.begin();
        try {
            chain.doFilter(request, response);
        } catch(Exception e) {
            Transaction.abort();
            throw (ServletException)e;
        }
        Transaction.commit();
    }

    @Override
    public void destroy() {}

}
