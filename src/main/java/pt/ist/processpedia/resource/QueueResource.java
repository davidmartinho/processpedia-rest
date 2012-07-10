package pt.ist.processpedia.resource;

import java.util.Set;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;
import pt.ist.processpedia.domain.Processpedia;
import pt.ist.processpedia.dto.QueueDto;
import pt.ist.processpedia.dto.mapper.DtoMapper;

@Path("/queue")
public class QueueResource {

    @Context
    private SecurityContext securityContext;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Set<QueueDto> getQueueSet() {
        return DtoMapper.queueDtoSetFromQueueSet(Processpedia.getInstance().getQueueSet());
    }

}
