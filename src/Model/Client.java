package Model;

public class Client {

    private String nom;
    private String prenom;
    private Adresse adresse;
    private Integer idClient;

    public Client(String nom,  String prenom ,Adresse adresse, Integer idClient) {
        this.nom = nom;
        this.adresse = adresse;
        this.prenom = prenom;
        this.idClient = idClient;
    }

    public Client() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    @Override
    public String toString() {
        return "Model.Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", idClient=" + idClient +
                "\n" + adresse.toString() +
                "}\n";
    }
}
