package Model;

import java.util.Date;

public class RendezVous {
    private String sujet;
    private Date date;
    private Client client;
    private Commercial commercial;

    public RendezVous(String sujet, Date date, Client client, Commercial commercial) {
        this.sujet = sujet;
        this.date = date;
        this.client = client;
        this.commercial = commercial;
    }

    public RendezVous() {
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
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

    public Commercial getCommercial() {
        return commercial;
    }

    public void setCommercial(Commercial commercial) {
        this.commercial = commercial;
    }

    @Override
    public String toString() {
        return "Model.RendezVous{" +
                "sujet='" + sujet + '\'' +
                ", date=" + date +
                ", client=" + client.toString() +
                ", commercial=" + commercial.toString() +
                '}';
    }
}
