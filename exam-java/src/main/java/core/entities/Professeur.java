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
public class Professeur {
    private Long id; // ID du professeur
    private String name; // Nom du professeur
    private String email; // Email du professeur
    private List<Cours> courses = new ArrayList<>(); // Liste des cours enseignés par le professeur

    // Constructeur par défaut
    public Professeur() {}

    // Constructeur avec nom et email
    public Professeur(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Constructeur avec nom uniquement
    public Professeur(String name) {
        this.name = name;
        this.email = ""; // ou une valeur par défaut
    }

    // Méthode pour ajouter un cours au professeur
    public void addCourse(Cours course) {
        this.courses.add(course);
    }
}
