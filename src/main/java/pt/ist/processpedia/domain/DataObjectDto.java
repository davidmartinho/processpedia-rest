package pt.ist.processpedia.domain;

public class DataObjectDto {

    private String id;
    private String label;

    public DataObjectDto(String id, String label) {
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
