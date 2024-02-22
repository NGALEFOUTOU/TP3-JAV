package monday;
import java.util.ArrayList ;
import java.util.List ;
public class GestionnaireEmployes extends Employe{
   // Attributs

   private List<Employe> listeEmployes;

   // Constructeur
   public GestionnaireEmployes(String nom, double salaire, int dateEmbauche) {
      super(nom, salaire, dateEmbauche);
      this.listeEmployes = new ArrayList<>();
   }
   // Methode

   public void ajouteremploye(Employe employe)   {listeEmployes.add(employe); System.out.println("Employe "+employe+" ajoute(e)");}
   public void supprimeremploye(Employe employe){listeEmployes.remove(employe) ;System.out.println("Employe "+employe+" ajoute(e)");}
   public void afficheremploye(){
      for(Employe employe: listeEmployes){
         System.out.println("Prénom(S) & Nom(s) : "+employe.getNom()) ;
      }
   }
}