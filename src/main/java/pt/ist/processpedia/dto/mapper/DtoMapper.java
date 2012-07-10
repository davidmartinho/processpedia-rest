package pt.ist.processpedia.dto.mapper;

import java.util.HashSet;
import java.util.Set;
import pt.ist.fenixframework.DomainObject;
import pt.ist.processpedia.domain.Queue;
import pt.ist.processpedia.domain.Request;
import pt.ist.processpedia.domain.Tag;
import pt.ist.processpedia.domain.User;
import pt.ist.processpedia.dto.QueueDto;
import pt.ist.processpedia.dto.RequestDto;
import pt.ist.processpedia.dto.TagDto;
import pt.ist.processpedia.dto.UserDto;

public class DtoMapper {

    public static UserDto userDtoFromUser(User user) {
        return new UserDto(user.getExternalId(), user.getEmail());
    }

    public static RequestDto requestDtoFromRequest(Request request) {
        return new RequestDto(request.getExternalId(), request.getSubject(), request.getLastUpdate(), userDtoFromUser(request.getInitiator()));
    }

    public static Set<RequestDto> requestDtoSetFromRequestSet(Set<Request> requestSet) {
        Set<RequestDto> requestDtoSet = new HashSet<RequestDto>();
        for(Request request : requestSet) {
            requestDtoSet.add(requestDtoFromRequest(request));
        }
        return requestDtoSet;
    }

    public static Set<QueueDto> queueDtoSetFromQueueSet(Set<Queue> queueSet) {
        Set<QueueDto> queueDtoSet = new HashSet<QueueDto>();
        for(Queue queue : queueSet) {
            queueDtoSet.add(queueDtoFromQueue(queue));
        }
        return queueDtoSet;
    }

    public static QueueDto queueDtoFromQueue(Queue queue) {
        return new QueueDto(queue.getExternalId(), queue.getName());
    }

    public static Set<TagDto> tagDtoSetFromTagSet(Set<Tag> tagSet) {
        Set<TagDto> tagDtoSet = new HashSet<TagDto>();
        for(Tag tag : tagSet) {
            tagDtoSet.add(tagDtoFromTag(tag));
        }
        return tagDtoSet;
    }

    public static TagDto tagDtoFromTag(Tag tag) {
        return new TagDto(tag.getExternalId(), tag.getLabel());
    }

}
