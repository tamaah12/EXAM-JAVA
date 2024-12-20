package core.controller;

import core.entities.Classe;
import core.entities.Cours;
import core.entities.Etudiant;
import core.entities.Niveau;
import core.entities.Session;
import core.services.GestionCours;
import core.services.GestionInscriptions;
import core.services.GestionSessions;

public class AdminController {
    private GestionCours gestionCours;
    private GestionSessions gestionSessions;
    private GestionInscriptions gestionInscriptions;

    public AdminController(GestionCours gestionCours, GestionSessions gestionSessions, GestionInscriptions gestionInscriptions) {
        this.gestionCours = gestionCours;
        this.gestionSessions = gestionSessions;
        this.gestionInscriptions = gestionInscriptions;
    }

    public void creerCours(Cours cours) {
        gestionCours.ajouterCours(cours);
    }

    public void afficherCoursParNiveau(Niveau niveau) {
        gestionCours.afficherCoursParNiveau(niveau);
    }

    public void planifierSession(Cours cours, Session session) {
        gestionSessions.planifierSession(cours, session);
    }

    public void inscrireEtudiant(Etudiant etudiant, Classe classe) {
        gestionInscriptions.inscrireEtudiant(etudiant, classe);
    }
}
