package com.example.dernierespoirsae.modele;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Map{

    private ObservableList<Integer> map;
    private ArrayList<Acteur> acteurs;
    private Acteur Joueur;


    public Map(int n, Acteur joueur){
        this.map = FXCollections.observableArrayList();
        creerMap(n);
        this.acteurs = new ArrayList<>();
        this.Joueur = joueur;
    }

    public ObservableList<Integer> getMap() {
        return map;
    }
    public void setActeurs(Acteur acteur) {
        this.acteurs.add(acteur);
    }

    public void creerMap(int n){
        for(int i = 0; i < n; i++){
            this.map.add(0);
        }
    }

    public void afficherMap(){
        for(int i = 0; i < this.map.size(); i++){
                System.out.print(this.map.get(i));
        }
        System.out.println();
    }

    public void creationDuneCase(){
        this.map.add(1);

    }
    public ArrayList<Acteur> getActeurs(){
        return this.acteurs;
    }
    public Acteur getJoueur() {
        return Joueur;
    }
}