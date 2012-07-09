package pt.ist.processpedia.dto.mapper;

import java.util.HashSet;
import java.util.Set;
import pt.ist.processpedia.domain.Request;
import pt.ist.processpedia.dto.RequestDto;

public class DtoMapper {

    public static RequestDto requestDtoFromRequest(Request request) {
        return new RequestDto(request.getExternalId(), request.getSubject());
    }

    public static Set<RequestDto> requestDtoSetFromRequestSet(Set<Request> requestSet) {
        Set<RequestDto> requestDtoSet = new HashSet<RequestDto>();
        for(Request request : requestSet) {
            requestDtoSet.add(requestDtoFromRequest(request));
        }
        return requestDtoSet;
    }

}
