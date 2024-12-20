package core.services.Impl;

import java.util.ArrayList;
import java.util.List;

import core.entities.Cours;
import core.entities.Niveau;
import core.services.GestionCours;

public class GestionCoursImpl implements GestionCours {
    private List<Cours> coursList = new ArrayList<>();

    @Override
    public void ajouterCours(Cours cours) {
        coursList.add(cours);
    }

    @Override
    public List<Cours> afficherCoursParNiveau(Niveau niveau) {
        // Retourner la liste des cours d'un niveau spécifique
        return coursList; // simplification
    }
}
