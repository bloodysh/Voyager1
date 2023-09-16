public class Transport extends OptionVoyage
{
    private boolean estLong;
    public static int TARIF_LONG = 1500;
    public static int TARIF_BASE = 200;

    public Transport (String unNom, double prixForfaitaire)

    {
        super (unNom, prixForfaitaire);
        this.estLong = false;
    }

    public Transport (String unNom, double prixForfaitaire, boolean estLong)

    {
        super (unNom, prixForfaitaire);
        this.estLong = estLong;
    }

    public double prix()
    {
        if (estLong)
        {
            return TARIF_LONG + super.prix();
        }
        else{
            return TARIF_BASE + super.prix();
        }
    }
}
