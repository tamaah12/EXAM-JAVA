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
    private Long id;
    private String name;
    private String email;
    private List<Cours> courses = new ArrayList<>();


    public Professeur() {}


    public Professeur(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public Professeur(String name) {
        this.name = name;
        this.email = "";
    }


    public void addCourse(Cours course) {
        this.courses.add(course);
    }
}
