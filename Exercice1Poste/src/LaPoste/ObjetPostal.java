package LaPoste;

public class ObjetPostal {

    private String Nom_Destinataire;
    private String Adresse_Destinataire;
    private int codePostal;
    private String NomVilleDestination;
    private boolean recommande;

    public String setNom_Destinataire(){
        return this.Nom_Destinataire;
    }
    public String setAdresse_Destinataire(String Adresse_Destinataire){
        return this.Adresse_Destinataire;
    }
    public String getAdresse_Destinataire(){  return Adresse_Destinataire; }
    public String setNomVilleDestination(String NomVilleDestination){
        return this.NomVilleDestination;
    }
    public String getNomVilleDestination(){ return NomVilleDestination;}
    public String setNom_Destinataire(String Nom_Destinataire){ return this.Nom_Destinataire;}

    public String getNom_Destinataire() { return Nom_Destinataire;}


    public ObjetPostal(String nom, String adresse, int cp, String ville, boolean reco){
        this.Nom_Destinataire=nom;
        this.Adresse_Destinataire=adresse;
        this.codePostal=cp;
        this.NomVilleDestination=ville;
        this.recommande=reco;

    }

    public String toString(){
        return "Destinataire : "+ Nom_Destinataire +" | Adresse : "+ Adresse_Destinataire + " | Code Postal : "+codePostal+" | Ville : "+NomVilleDestination+" | Recommandé : "+recommande;

    }
    public static void main(String[] args){
        ObjetPostal Objet1= new ObjetPostal("Dubois", "52 rue de verdun", 78200, "Mantes",true);
        System.out.println(Objet1.toString());
        Lettre lettre1 = new Lettre("Dorian","manets",78250,"paris",false);
        System.out.println(lettre1.toString());

    }
}
