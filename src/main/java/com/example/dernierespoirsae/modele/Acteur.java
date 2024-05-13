package com.example.dernierespoirsae.modele;

import javafx.beans.property.IntegerProperty;

public class Acteur {
    private IntegerProperty x;
    private IntegerProperty y;
    private String nom;


    public Acteur(IntegerProperty x,IntegerProperty y, String nom) {
        this.x = x;
        this.y = y;
        this.nom = nom;
    }
//    public Acteur( String nom) {
//        x = //TODO;
//        y = //TODO;
//        this(map,x,y,nom);
//    }


    public int getX() {
        return x.get();
    }

    public IntegerProperty xProperty() {
        return x;
    }

    public int getY() {
        return y.get();
    }

    public IntegerProperty yProperty() {
        return y;
    }

    public String getNom() {
        return nom;
    }

    public void seDeplacer(String touche){
        switch (touche){
            case "z" :
                this.y.setValue(getY()-30);
                break;
            case "d" :
                this.x.setValue(getX()+30);
                break;
            case "s" :
                this.y.setValue(getY()+30);
                break;
            case "q" :
                this.x.setValue(getX()-30);
                break;
        }
    }
}
