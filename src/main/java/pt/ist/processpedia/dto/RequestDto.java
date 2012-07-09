package pt.ist.processpedia.dto;

public class RequestDto {

    private String id;
    private String subject;

    public RequestDto(String id, String subject) {
        this.id = id;
        this.subject = subject;
    }

    public String getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }
}
