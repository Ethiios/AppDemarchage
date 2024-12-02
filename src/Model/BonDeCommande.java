package Model;

import java.util.Date;

public class BonDeCommande {

    private Integer numero;
    private Double montant;
    private String description;
    private Date date;
    private Client client;
    private Date dateEncaissement;
    private Reglement reglement;
    private Commercial commercial;
    private Statut statut;

    public BonDeCommande(Integer numero, Double montant, String description, Date date, Client client, Date dateEncaissement, Reglement reglement, Commercial commercial, Statut statut) {
        this.numero = numero;
        this.montant = montant;
        this.description = description;
        this.date = date;
        this.client = client;
        this.dateEncaissement = dateEncaissement;
        this.reglement = reglement;
        this.commercial = commercial;
        this.statut = statut;
    }

    public BonDeCommande() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDateEncaissement() {
        return dateEncaissement;
    }

    public void setDateEncaissement(Date dateEncaissement) {
        this.dateEncaissement = dateEncaissement;
    }

    public Reglement getReglement() {
        return reglement;
    }

    public void setReglement(Reglement reglement) {
        this.reglement = reglement;
    }

    public Commercial getCommercial() {
        return commercial;
    }

    public void setCommercial(Commercial commercial) {
        this.commercial = commercial;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Model.BonDeCommande{" +
                "numero=" + numero +
                ", montant=" + montant +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", dateEnregistrement=" + dateEncaissement +
                ", " + reglement +
                ", " + commercial +
                ", " + statut +
                "\n " + client +
                '}';
    }
}
