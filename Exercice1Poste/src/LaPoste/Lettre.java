package LaPoste;

public class Lettre extends ObjetPostal{


    private boolean urgence;

    public Lettre(String nom, String adresse, int cp, String ville, boolean reco) {
        super(nom, adresse, cp, ville, reco);
    }


    public String toString(){
        return ("nom:"+this.getNom_Destinataire()+"adresse:"+this.getAdresse_Destinataire());
    }


}
