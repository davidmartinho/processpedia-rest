package pt.ist.processpedia.dto;

public class UserDto {

    private String id;
    private String name;

    public UserDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
