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
public class Cours {
    private Long id; // ID du cours
    private String name; // Nom du cours
    private Module module; // Module associé au cours
    private Professeur professeur; // Professeur associé au cours
    private List<Classe> classes = new ArrayList<>(); // Classes associées au cours

    // Constructeur sans paramètres
    public Cours() {}

    // Constructeur avec nom, module et professeur
    public Cours(String name, Module module, Professeur professeur) {
        this.name = name;
        this.module = module;  // Mise à jour pour utiliser le type Module
        this.professeur = professeur;  // Mise à jour pour utiliser Professeur
    }

    // Méthode pour ajouter une classe au cours
    public void addClass(Classe c) {
        this.classes.add(c);
    }
}
