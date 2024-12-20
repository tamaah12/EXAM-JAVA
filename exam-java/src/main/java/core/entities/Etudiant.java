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
    private Long id; // ID de l'étudiant
    private String name; // Nom de l'étudiant
    private String email; // Email de l'étudiant
    private Classe cdsdClasse; // Classe dans laquelle l'étudiant est inscrit

    // Constructeur
    public Etudiant() {}

    public Etudiant(String name, String email, Classe cdsdClasse) {
        this.name = name;
        this.email = email;
        this.cdsdClasse = cdsdClasse;
    }
}
