package com.example.dernierespoirsae.modele;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Environnement{

    private ArrayList<Acteur> acteurs;
    private Acteur Joueur;

    private Map map;


    public Environnement(int n, Acteur joueur){
        this.map = new Map(n);
        this.acteurs = new ArrayList<>();
        this.Joueur = joueur;
    }

    public void addActeurs(Acteur acteur) {
        this.acteurs.add(acteur);
    }

    public ArrayList<Acteur> getActeurs(){
        return this.acteurs;
    }
    public Acteur getJoueur() {
        return Joueur;
    }
    public Map getMap() {
        return this.map;
    }
}