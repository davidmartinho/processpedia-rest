package pt.ist.processpedia.dto;

import org.joda.time.DateTime;

public class RequestDto {

    private String id;
    private String subject;
    private DateTime lastUpdate;

    private UserDto initiator;

    public RequestDto(String id, String subject, DateTime lastUpdate, UserDto initiator) {
        this.id = id;
        this.subject = subject;
        this.lastUpdate = lastUpdate;
        this.initiator = initiator;
    }

    public String getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public DateTime getLastUpdate() {
        return lastUpdate;
    }

    public UserDto getInitiator() {
        return initiator;
    }
}
