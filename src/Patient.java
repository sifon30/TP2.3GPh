import java.util.*;

class Patient {
    private String nom;
    private Set<String> ordonnace;

    public Patient(String nom) {
        this.nom = nom;
        ordonnace = new HashSet<String>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean ordonnanceVide() {
        return ordonnace.isEmpty();
    }

    public void ajoutMedicament(String m) {
        ordonnace.add(m);
    }

    public void affiche() {
        System.out.println("nom du patient : " + nom);
        System.out.println("ordonnance : " + ordonnace);

    }

    public boolean contientMedicament(String m) {
        return ordonnace.contains(m);
    }

    public void trieOrdonnance() {
        List<String> LOrdonnance = new ArrayList<>(ordonnace);
        Collections.sort(LOrdonnance);

        ordonnace = new HashSet<>(LOrdonnance);
    }

}