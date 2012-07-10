package pt.ist.processpedia.resource;

import java.util.Set;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;
import pt.ist.processpedia.domain.Processpedia;
import pt.ist.processpedia.domain.Request;
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

    @GET
    @Path("inbox")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<RequestDto> getInboxRequestDtoSet() {
        return DtoMapper.requestDtoSetFromRequestSet(Processpedia.getInstance().getRequestSet());
    }

    @GET
    @Path("pending")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<RequestDto> getPendingRequestDtoSet() {
        return DtoMapper.requestDtoSetFromRequestSet(Processpedia.getInstance().getRequestSet());
    }

    @GET
    @Path("executing")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<RequestDto> getExecutingRequestDtoSet() {
        return DtoMapper.requestDtoSetFromRequestSet(Processpedia.getInstance().getRequestSet());
    }

    @GET
    @Path("completed")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<RequestDto> getCompletedRequestDtoSet() {
        return DtoMapper.requestDtoSetFromRequestSet(Processpedia.getInstance().getRequestSet());
    }

    @GET
    @Path("draft")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<RequestDto> getDraftRequestDtoSet() {
        return DtoMapper.requestDtoSetFromRequestSet(Processpedia.getInstance().getRequestSet());
    }

    @GET
    @Path("{requestId}")
    @Produces(MediaType.APPLICATION_JSON)
    public RequestDto getRequestById(@PathParam("requestId") String requestId) {
        return DtoMapper.requestDtoFromRequest((Request)Request.fromExternalId(requestId));
    }

}
