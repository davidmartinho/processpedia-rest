package pt.ist.processpedia.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;
import pt.ist.processpedia.dto.UserDto;

@Path("/user")
public class UserResource {

    @Context
    private SecurityContext securityContext;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public UserDto sayHello() {
        return new UserDto(securityContext.getUserPrincipal().getName());
    }

}
