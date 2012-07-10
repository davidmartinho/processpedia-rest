package pt.ist.processpedia.resource;

import java.util.Set;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import pt.ist.processpedia.domain.Processpedia;
import pt.ist.processpedia.dto.TagDto;
import pt.ist.processpedia.dto.mapper.DtoMapper;

@Path("/tag")
public class TagResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Set<TagDto> getTagSet() {
        return DtoMapper.tagDtoSetFromTagSet(Processpedia.getInstance().getTagSet());
    }

}
