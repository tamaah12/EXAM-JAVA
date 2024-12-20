package core.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Etudiant {
    private Long id;
    private String name;
    private String email;
    private Classe cdsdClasse;


    public Etudiant() {}

    public Etudiant(String name, String email, Classe cdsdClasse) {
        this.name = name;
        this.email = email;
        this.cdsdClasse = cdsdClasse;
    }
}
