package com.example.dernierespoirsae.modele;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Acteur {

    private IntegerProperty xProperty, yProperty;
    private String nom;
    private Map map;

    public Acteur(int x,int y, String nom) {
        this.xProperty = new SimpleIntegerProperty(x);
        this.yProperty = new SimpleIntegerProperty(y);
        this.nom = nom;
    }
    public Acteur( String nom) {
        this(0,0,nom);
    }


    public void setX(IntegerProperty x){
        this.xProperty = x;
    }

    public void setY(IntegerProperty y){
        this.xProperty = y;
    }

    public int getX() {
        return xProperty.getValue();
    }

    public final IntegerProperty xProperty() {
        return xProperty;
    }

    public int getY() {
        return yProperty.getValue();
    }

    public final IntegerProperty yProperty() {
        return xProperty;
    }

    public String getNom() {
        return nom;
    }

    public void seDeplacer(String touche){
        switch (touche){
            case "z" :
                this.yProperty.setValue(getY()-5);
                break;
            case "d" :
                this.xProperty.setValue(getX()+5);
                break;
            case "s" :
                this.yProperty.setValue(getY()+5);
                break;
            case "q" :
                this.xProperty.setValue(getX()-5);
                break;
        }
    }
}
