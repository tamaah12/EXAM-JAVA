package core.entities;

import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Classe {
    private Long id; // ID de la classe
    private String name; // Nom de la classe
    private Niveau niveau; // Niveau de la classe
    private List<Etudiant> students = new ArrayList<>(); // Liste des étudiants dans la classe

    // Constructeur
    public Classe() {}

    public Classe(String name, Niveau niveau) {
        this.name = name;
        this.niveau = niveau;
    }

    // Méthode pour ajouter un étudiant à la classe
    public void addStudent(Etudiant etudiant) {
        this.students.add(etudiant);
    }
}
