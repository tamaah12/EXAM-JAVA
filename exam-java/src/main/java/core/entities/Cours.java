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
    private Long id;
    private String name;
    private Module module;
    private Professeur professeur;
    private List<Classe> classes = new ArrayList<>();


    
    public Cours() {}


    public Cours(String name, Module module, Professeur professeur) {
        this.name = name;
        this.module = module;
        this.professeur = professeur;
    }


    public void addClass(Classe c) {
        this.classes.add(c);
    }
}
