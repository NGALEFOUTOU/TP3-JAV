package monday;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander les informations de l'employé
        System.out.println("Entrez le nom de l'employé : ");
        String nom = scanner.nextLine();

        System.out.println("Entrez le salaire de l'employé (MAD): ");
        double salaire = scanner.nextDouble();

        System.out.println("Entrez l'année d'embauche de l'employé : ");
        int dateEmbauche = scanner.nextInt();

        // Création de l'employé avec les informations fournies
        Employe employe = new Employe(nom, salaire, dateEmbauche);

        // Afficher les informations de l'employé
        System.out.println("\nInformations de l'employé :");
        System.out.println("Nom : " + employe.getNom());
        System.out.println("Salaire : " + employe.getSalary());
        System.out.println("Date d'embauche : " + employe.getDateEmbauche());

        // Demander des informations supplémentaires pour le calcul du salaire
        System.out.println("\nEntrez le bonus pour le calcul du salaire (MAD): ");
        double bonus = scanner.nextDouble();

        System.out.println("Entrez le nombre d'heures pour le calcul du salaire (h): ");
        int heures = scanner.nextInt();

        // Calculer et afficher le salaire avec le bonus
        double salaireAvecBonus = employe.calculateSalary(bonus, heures);
        System.out.println("\nSalaire Brute : " + salaireAvecBonus + " MAD");

        // Fermer le scanner
        scanner.close();
    }
}
