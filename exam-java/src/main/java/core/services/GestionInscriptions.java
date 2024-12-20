package core.services;

import core.entities.Classe;
import core.entities.Etudiant;

public interface GestionInscriptions {
    void inscrireEtudiant(Etudiant etudiant, Classe classe);
}
