package core.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Module {
    private Long id;
    private String name;
    private String description;


    
    public Module() {}


    public Module(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public Module(String name) {
        this.name = name;
    }
}
