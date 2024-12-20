package core.services;

import java.util.List;

import core.entities.Cours;
import core.entities.Niveau;

public interface GestionCours {
    void ajouterCours(Cours cours);
    List<Cours> afficherCoursParNiveau(Niveau niveau);
}
