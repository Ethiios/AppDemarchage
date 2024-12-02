package View;

import Model.*;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Affichage {

    public static void Menu() {                                                             // methode pour l'affichage du menu
        System.out.println("1 -> Afficher les Rendez-vous");
        System.out.println("2 -> Crée un Bon de Commande");
        System.out.println("3 -> Afficher les Clients");
        System.out.println("4 -> Cherche un Bon de Commande( Par nom de Model.Client )");
        System.out.println("5 -> Cherche un Model.Client ( Par Nom )");
        System.out.println("6 -> Modifier le Statut d'un bon de Commande");


    }

    public static Scanner scan = new Scanner(System.in);

    public static void ecrireFicher(ArrayList<BonDeCommande> bonDeCommandes){
        try{
            PrintWriter ecrire;
            int n = 5;
            File rep = new File("texte");
            rep.mkdir();

            String nomFichierSortie = "texte"+File.separator+"monfichier.txt";

            ecrire =  new PrintWriter(new BufferedWriter
                    (new FileWriter(nomFichierSortie)));

            for(BonDeCommande bdc : bonDeCommandes){
                ecrire.println(bdc);
            }
            ecrire.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public static void lireFicher(){
        try{
            Scanner lecture;
            String nomFichierSortie = "texte" + File.separator + "monFichier.txt";
            File fichier = new File(nomFichierSortie);
            lecture = new Scanner(fichier);
            while (lecture.hasNextLine()) {
                String text = lecture.nextLine();
                if (!text.isEmpty()) {
                    System.out.println(text);
                }
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void Menu2() throws ParseException {

        ArrayList<BonDeCommande> bonDeCommandes = new ArrayList<>();
        ArrayList<RendezVous> rendezVous = new ArrayList<>();
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Commercial> commerciaux = new ArrayList<>();


        DateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");
        //TODO Création de Rendez-vous en dur dans le code ! ( Rendez vous 1 )
        Date dateRendezVous = dateForm.parse("03/12/2024");
        Adresse adresse = new Adresse("1Bis", "Rue de la Paix", "Morlaix", 46890);
        //TODO Ajout de la taille du tableau +1 à chaque client
        Client client = new Client("Hubert", "Jason", adresse, clients.size() + 1);
        clients.add(client);
        Commercial commercial = new Commercial(commerciaux.size() + 1, "Dubalais", "Jean-Heude");
        commerciaux.add(commercial);
        RendezVous r1 = new RendezVous("Devis Panneaux solaire", dateRendezVous, client, commercial);
        rendezVous.add(r1);

        //TODO Création de Rendez-vous en dur dans le code ! ( Rendez vous 2 )
        dateRendezVous = dateForm.parse("03/12/2024");
        adresse = new Adresse("1Bis", "Rue de la Paix", "Morlaix", 46890);
        client = new Client("Hubert", "Jason", adresse, clients.size() + 1);
        clients.add(client);
        r1 = new RendezVous("Devis Panneaux solaire", dateRendezVous, client, commercial);
        rendezVous.add(r1);


        //TODO Création de Rendez-vous en dur dans le code ! ( Rendez vous 3 )
        dateRendezVous = dateForm.parse("03/12/2024");
        adresse = new Adresse("1Bis", "Rue de la Paix", "Morlaix", 46890);
        client = new Client("Hubert", "Jason", adresse, clients.size() + 1);
        clients.add(client);
        r1 = new RendezVous("Devis Panneaux solaire", dateRendezVous, client, commercial);
        rendezVous.add(r1);

        //TODO Création de Rendez-vous en dur dans le code ! ( Rendez vous 4 )
        dateRendezVous = dateForm.parse("03/12/2024");
        adresse = new Adresse("1Bis", "Rue de la Paix", "Morlaix", 46890);
        client = new Client("Hubert", "Jason", adresse, clients.size() + 1);
        clients.add(client);
        r1 = new RendezVous("Devis Panneaux solaire", dateRendezVous, client, commercial);
        rendezVous.add(r1);

        //TODO Création de Rendez-vous en dur dans le code ! ( Rendez vous 5 )
        dateRendezVous = dateForm.parse("03/12/2024");
        adresse = new Adresse("1Bis", "Rue de la Paix", "Morlaix", 46890);
        client = new Client("Hubert", "Jason", adresse, clients.size() + 1);
        clients.add(client);
        r1 = new RendezVous("Devis Panneaux solaire", dateRendezVous, client, commercial);
        rendezVous.add(r1);

        boolean continuer = true;


        while (continuer) {
            Menu();
            int choix = scan.nextInt();
            scan.nextLine();
            switch (choix) {
                //TODO Case 1 Permet d'afficher les rendez_vous
                case 1:
                    for (RendezVous r : rendezVous) {
                        //TODO on Apelle la méthode to.String de Model.RendezVous.
                        System.out.println(r.toString());
                    }
                    //TODO Création d'un bon de commande
                case 2:
                    String scanned = null;
                    Commercial commercialbdc = null;
                    while (commercialbdc == null) {


                        System.out.println("Veuillez saisir l'identifiant du commercial");
                        scanned = scan.nextLine();
                        Integer identifiant;
                        try {
                            identifiant = parseInt(scanned);
                        } catch (NumberFormatException e) {
                            identifiant = 0;
                            System.out.println("Seul les valeur numérique sont accepter");
                        }
                        for (Commercial c : commerciaux) {
                            if (identifiant.equals(c.getIdentifiant())) {
                                commercialbdc = c;
                                System.out.println("Vous êtes connecter en temps que : \n" + c.toString());
                                break;
                            }
                        }
                        if (commercialbdc == null) {
                            System.out.println("L'identifiant est incorrect");
                        }
                    }
                    Double montant = null;
                    while (montant == null) {
                        System.out.println("Saisir un montant");
                        scanned = scan.nextLine();

                        try {
                            montant = parseDouble(scanned);
                        } catch (Exception e) {
                            System.out.println("Seul les valeurs numérique sont accepter");
                            montant = null;
                        }
                    }

                    System.out.println("Veuillez rentrer une description");
                    String description = scan.nextLine();


                    //TODO Date de prise de rendez vous !
                    Date date = new Date();

                    System.out.println("Veuillez saisir le nom du client");
                    String nomClient = scan.nextLine();
                    System.out.println("Veuillez saisir le prenom du client");
                    String prenomClient = scan.nextLine();
                    System.out.println("Veuillez saisir le numéro de l'adresse du client");
                    String numeroAdresse = scan.nextLine();
                    System.out.println("Veuillez saisir le nom de la rue du client");
                    String rueClient = scan.nextLine();
                    System.out.println("Veuillez saisir le nom de la Ville du client");
                    String villeClient = scan.nextLine();

                    Integer codePostal = null;
                    while (codePostal == null) {
                        System.out.println("Saisir un Code Postal");
                        scanned = scan.nextLine();
                        try {
                            codePostal = parseInt(scanned);
                        } catch (Exception e) {
                            System.out.println("Seul les valeurs numérique sont accepter");
                            codePostal = null;
                        }
                    }
                    adresse = new Adresse(numeroAdresse, rueClient, villeClient, codePostal);
                    client = new Client(nomClient, prenomClient, adresse, clients.size() + 1);
                    clients.add(client);

                    //TODO Date d'encaissement du bon de commande !
                    //Saisie d'une date
                    Date dateEncaissement = null;
                    while (dateEncaissement == null) {
                        System.out.println("Veuillez rentrer la Date d'encaissement");
                        scanned = scan.nextLine();
                        try {
                            dateEncaissement = dateForm.parse(scanned);

                        } catch (Exception e) {
                            System.out.println("Seul le format date dd/MM/yyyy est accepter !");
                        }
                    }
                    System.out.println("Veuillez saisir le moyen de paiment : \n 1 = Cheque \n 2 = Espece \n 3 = Virement \n 4 = Carte Bancaire");
                    scanned = scan.nextLine();
                    String libelleReglement = "";
                    if (Objects.equals(scanned, "1")) {
                        libelleReglement = "Cheque";
                    } else if (Objects.equals(scanned, "2")) {
                        libelleReglement = "Espece";
                    } else if (Objects.equals(scanned, "3")) {
                        libelleReglement = "Virement";
                    } else if (Objects.equals(scanned, "4")) {
                        libelleReglement = "Carte bancaire";
                    }
                    Reglement reglement = new Reglement(libelleReglement);
                    Statut statut = new Statut(1);

                    BonDeCommande bonDeCommande = new BonDeCommande(bonDeCommandes.size() + 1, montant, description, date, client, dateEncaissement, reglement, commercial, statut);
                    bonDeCommandes.add(bonDeCommande);

                    System.out.println("Votre Bon de Commande à été valider");
                    System.out.println(bonDeCommande.toString());

                    ecrireFicher(bonDeCommandes);

                    break;

                //TODO Afficher les Clients
                case 3:
                    for (Client c : clients) {
                        //TODO on Apelle la méthode to.String de Model.RendezVous.
                        System.out.println(c.toString());
                    }
                    break;

                //TODO Cherche un Bon de Commande( Par nom de Model.Client )
                case 4:
                    //Proposer a l'utilisateur de renseigner un client
                    System.out.println("Renseigner un nom de client");
                    nomClient = scan.nextLine();
                    //Appeller un Model.Client qui retourner un bon de commande
                    boolean isTrouver = false;
                    for (BonDeCommande bdc: bonDeCommandes) {
                        // nomClient de Bon de commande soit = nomClient de mon Model.Client saisie
                        if(Objects.equals(bdc.getClient().getNom(), nomClient)){
                            System.out.println(bdc.toString());
                            isTrouver = true;
                        }
                    }
                    // (!isTrouver) = (isTrouver == False;)
                    if (!isTrouver){
                        System.out.println("Le nom de client saisie ne correspond à aucun Bon de Commande");
                    }
                    break;
                //TODO Cherche un Model.Client ( Par Nom )
                case 5:
                    //Proposer a l'utilisateur de renseigner un client
                    System.out.println("Renseigner un nom de client");
                    nomClient = scan.nextLine();
                    //Appeller un Model.Client qui retourner un bon de commande
                    isTrouver = false;
                    for (Client c: clients) {
                        // nomClient de Bon de commande soit = nomClient de mon Model.Client saisie
                        if(Objects.equals(c.getNom(), nomClient)){
                            System.out.println(c.toString());
                            isTrouver = true;
                        }
                    }
                    // (!isTrouver) = (isTrouver == False;)
                    if (!isTrouver){
                        System.out.println("Le nom de client saisie ne correspond à aucun Model.Client Enregistrer");
                    }

                    break;

                case 6:
                    System.out.println("1 -> Vente Valider");
                    System.out.println("2 -> Vente en Cours");
                    System.out.println("3 -> Vente Annulé");
                    System.out.println("4 -> Retour au Menu Précédent");
                    choix = scan.nextInt();
                    scan.nextLine();
                    switch (choix) {
                        case 1:
                            //cherche un bon de commande par nom de client
                            //récuperer un bon de commande par identifiant

                            break;

                        case 2:

                            break;

                        case 3:

                            break;

                        case 4:
                            break;

                        default:
                            break;


                    }
                    break;
            }
        }

    }
}