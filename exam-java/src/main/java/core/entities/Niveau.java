package core.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Niveau {
    private Long id;
    private String name;


    public Niveau() {}

    public Niveau(String name) {
        this.name = name;
    }
}
