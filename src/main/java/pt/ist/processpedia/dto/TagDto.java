package pt.ist.processpedia.dto;

public class TagDto {

    private String id;
    private String label;

    public TagDto(String id, String label) {
        this.id = id;
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }
}
