package Model;

public class Reglement {
    /**
     * La variable libelle ne peut avoir comme valeur, "chèque","espece","virement","carte bancaire".
     */
    private String libelle;

    public Reglement(String libelle) {
        this.libelle = libelle;
    }

    public Reglement() {
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Model.Reglement{" +
                "libelle='" + libelle + '\'' +
                '}';
    }
}
