package core.services;

import core.entities.Cours;
import core.entities.Session;

public interface GestionSessions {
    void planifierSession(Cours cours, Session session);
}
