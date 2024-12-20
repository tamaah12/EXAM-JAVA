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
    private Long id;
    private String name;
    private Niveau niveau;
    private List<Etudiant> students = new ArrayList<>();


    public Classe() {}

    public Classe(String name, Niveau niveau) {
        this.name = name;
        this.niveau = niveau;
    }


    public void addStudent(Etudiant etudiant) {
        this.students.add(etudiant);
    }
}
