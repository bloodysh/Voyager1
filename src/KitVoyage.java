import java.util.ArrayList;

public class KitVoyage {
    private ArrayList<OptionVoyage> lesOptions;
        private String depart;
        private String destination;
    
        public String getDepart() {
            return depart;
        }

        public String getDestination() {
            return destination;
        }

        public KitVoyage (String leDepart, String laDestination)
        {
            this.depart=leDepart;
            this.destination= laDestination;
            lesOptions = new ArrayList<OptionVoyage>();  }

        public double prix()
        {
            double resultat= 0;
            for (OptionVoyage uneOption: lesOptions)
            {
                resultat =+ uneOption.prix();
            }
            return resultat;
        }

        @Override
        public String toString() {
            String chaine = "Voyage de depart" + depart + "a " + destination + " avec pour options: \n";
            for (OptionVoyage uneOption: lesOptions)
            {
            
                chaine+=  "->" + uneOption.toString();
            }
            return chaine;
        
        }

        public void ajouterOption(OptionVoyage uneOption)
        {
            if (uneOption != null)
            {
                lesOptions.add(uneOption);
            }
        
        }

        public void annuler ()
        {
            lesOptions.clear();
        }

        public int getNbOptions ()
        {
            return lesOptions.size();
        }


    


}
