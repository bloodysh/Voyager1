public class Sejour extends OptionVoyage{
    private int nbNuit;
    private double prixNuit;

    public Sejour (String unNom, double prixNuit, int nbNuit, double prixForfaitaire)
    {
        super (unNom, prixForfaitaire);
        this.prixNuit=prixNuit;
        this.nbNuit=nbNuit;
    } 

    public double Prix()
    {
        return nbNuit * prixNuit + super.prix();
    }

}

