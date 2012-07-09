package pt.ist.processpedia.resource;

import java.util.Set;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;
import pt.ist.processpedia.domain.Processpedia;
import pt.ist.processpedia.dto.RequestDto;
import pt.ist.processpedia.dto.mapper.DtoMapper;

@Path("/request")
public class RequestResource {

    @Context
    private SecurityContext securityContext;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Set<RequestDto> getRequestDtoSet() {
        return DtoMapper.requestDtoSetFromRequestSet(Processpedia.getInstance().getRequestSet());
    }



}
