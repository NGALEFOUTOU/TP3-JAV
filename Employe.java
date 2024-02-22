package monday;

// tache1

public class Employe {
    private String name ;
    private double salary;
    private int dateEmbauche;

// constructeur------------------------------------------

    public Employe(String nom, double sal, int date){
        this.name         = nom;
        this.salary       = sal ;
        this.dateEmbauche = date ;
    }


            //tache3

    // Méthodes pour acceder
    public String getNom()         {return name ;}
    public double getSalary()      {return salary ;}
    public int getDateEmbauche(){return dateEmbauche ;}

    // Méthodes pour modifier
    public void setNom(String nom)          {this.name = nom ;}
    public void setSalary(double sal)       {this.salary = sal ;}
    public void setDateEmbauche(int date){this.dateEmbauche = date ;}

    // Methode------------------//
    /*  COMPLEMENT(s)*
     * -- Bonus
     * -- Heures sup
     * -- Others
     */
/*
    public double calculsalary(double bonus, int heure){
        double hour = (double)heure ;
        double s    = salary + bonus + ((salary*(hour))/100) ;
        return s ;
    }*/

    public double calculateSalary(double bonus, int hours) {
        double hour = (double) hours;
        double baseSalary = salary + bonus + ((salary * (hour)) / 100);
        int c = getDateEmbauche();
        final int currentYear = 2024;
        int experience = (currentYear - c);

        if (experience > 3) {
            // Aucune augmentation pour moins de 3 ans
            return baseSalary;
        } else if (experience > 5) {
            // Augmentation de 13% pour plus de 3 ans
            return baseSalary * 1.13;
        } else if (experience > 8) {
            // Augmentation de 35% et bonus de 0.3% pour plus de 5 ans
            return baseSalary * 1.35 + 0.003 * baseSalary;
        } else {
            // Augmentation de 47% et bonus de 0.54% pour plus de 8 ans
            return baseSalary * 1.47 + 0.0054 * baseSalary;
        }


    }


}


/*
public class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }*/

