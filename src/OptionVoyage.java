public class OptionVoyage {
    private String nomVoyage;
    private double prixForfaitaire;
    private boolean tarifReduit;
    private static double COEF_TARIF_REDUIT = 0.8;

    public OptionVoyage (String unNom, double unPrix)
    {
        nomVoyage = unNom;
        prixForfaitaire = unPrix;
    }

    public String getNomVoyage() {
        return nomVoyage;
    }

    public double prix()
   {
        return prixForfaitaire;
   }

    @Override
    public String toString() {
        return nomVoyage + " -> " + prixForfaitaire + " euros";
    } 

   

}

