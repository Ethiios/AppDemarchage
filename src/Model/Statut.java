package Model;

public class Statut {

    private Integer identifiant;


    public Statut(Integer identifiant) {
        this.identifiant = identifiant;
    }

    public Statut() {
    }

    public Integer getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(Integer identifiant) {
        this.identifiant = identifiant;
    }

    @Override
    public String toString() {
        String valReturn = null;
        if (identifiant == 1) {
            valReturn = "Vente en Cours";
        }
        if (identifiant == 2) {
            valReturn = "Vente Valider";
        }
        if (identifiant == 3) {
            valReturn = "Vente Annulé";
        }
        return "Model.Statut{" +
                valReturn + '}';
    }
}
