public class App {
    public static void main(String[] args) throws Exception {
        DossierPharmacie pharmacie = new DossierPharmacie(" Pharmacie");

        pharmacie.nouveauPatient("saif ", new String[] { "Maxilasse ", "Aspirin" });
        pharmacie.nouveauPatient("khaled", new String[] { "Panadol", "Vitamin C" });
        pharmacie.affiche();

        pharmacie.ajoutMedicament("saif", "Vitamin D");
        pharmacie.affichePatient("saif");

        System.out.println("Patients ayant pris de Panadol : " + pharmacie.affichePatientAvecMedicament("Panadol"));

    }
}
