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
    private Long id; // ID du niveau
    private String name; // Nom du niveau (par exemple, "Débutant", "Avancé")

    // Constructeur
    public Niveau() {}

    public Niveau(String name) {
        this.name = name;
    }
}
