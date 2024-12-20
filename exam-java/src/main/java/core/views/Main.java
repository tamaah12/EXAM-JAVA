package core.views;

import java.util.Scanner;

import core.controller.AdminController;
import core.entities.Classe;
import core.entities.Cours;
import core.entities.Module;
import core.entities.Niveau;
import core.entities.Professeur;
import core.services.GestionCours;
import core.services.GestionInscriptions;
import core.services.GestionSessions;
import core.services.Impl.GestionCoursImpl;
import core.services.Impl.GestionInscriptionsImpl;
import core.services.Impl.GestionSessionsImpl;

public class Main {
    public static void main(String[] args) {
        int choix = 0;
        Scanner scanner = new Scanner(System.in);


        GestionCours gestionCours = new GestionCoursImpl();
        GestionSessions gestionSessions = new GestionSessionsImpl();
        GestionInscriptions gestionInscriptions = new GestionInscriptionsImpl();


        AdminController adminController = new AdminController(gestionCours, gestionSessions, gestionInscriptions);

        do {
            System.out.println("1- Créer un cours");
            System.out.println("2- Afficher les cours par niveau");
            System.out.println("3- Quitter");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:

                System.out.println("Entrez le nom du professeur : ");
                    String nomProfesseur = scanner.nextLine();
                    System.out.println("Entrez l'email du professeur : ");
                    String emailProfesseur = scanner.nextLine();
                    Professeur professeur = new Professeur(nomProfesseur, emailProfesseur);

                    System.out.println("Entrez le nom du module : ");
                    String nomModule = scanner.nextLine();
                    System.out.println("Entrez la description du module : ");
                    String descriptionModule = scanner.nextLine();
                    Module module = new Module(nomModule, descriptionModule);

                    System.out.println("Entrez le nom de la classe : ");
                    String nomClasse = scanner.nextLine();
                    Classe classe = new Classe(nomClasse, null);

                    System.out.println("Entrez le titre du cours : ");
                    String titreCours = scanner.nextLine();
                    Cours cours = new Cours(titreCours, module, professeur);


                    adminController.creerCours(cours);
                    break;

                case 2:

                System.out.println("Entrez le niveau des cours (par exemple, Débutant, Intermédiaire, Avancé) : ");
                    String niveauNom = scanner.nextLine();
                    Niveau niveau = new Niveau(niveauNom);
                    adminController.afficherCoursParNiveau(niveau);
                    break;

                case 3:
                    System.out.println("Quitter...");
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        } while (choix != 3);

        scanner.close();
    }
}
