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
    private Long id; // ID du module
    private String name; // Nom du module
    private String description; // Description du module

    // Constructeur par défaut
    public Module() {}

    // Constructeur avec nom et description
    public Module(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Nouveau constructeur avec seulement un nom
    public Module(String name) {
        this.name = name;
    }
}
