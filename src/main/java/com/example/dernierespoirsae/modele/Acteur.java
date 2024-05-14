package com.example.dernierespoirsae.modele;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Acteur {

    private IntegerProperty xProperty, yProperty;
    private String nom;
    private Map terrain;

    public Acteur(int x,int y, String nom) {
        this.xProperty = new SimpleIntegerProperty(x);
        this.yProperty = new SimpleIntegerProperty(y);
        this.nom = nom;
    }
    public Acteur( String nom) {
        this(0,0,nom);
    }


    public void setX(int x){
        this.xProperty.setValue(x);
    }

    public void setY(int y){
        this.yProperty.setValue(y);
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
        return yProperty;
    }

    public String getNom() {
        return nom;
    }

    public void seDeplacer(String direction){
        switch (direction){
            case "up" :
                this.yProperty.setValue(getY()-5);
                if(!collision(terrain))
                    this.yProperty.setValue(getY()+5);
                break;

            case "right" :
                this.xProperty.setValue(getX()+5);
                if(!collision(terrain))
                    this.xProperty.setValue(getX()-5);
                break;

            case "down" :
                this.yProperty.setValue(getY()+5);
                if(!collision(terrain))
                    this.yProperty.setValue(getY()-5);
                break;

            case "left" :
                this.xProperty.setValue(getX()-5);
                if(!collision(terrain))
                    this.xProperty.setValue(getX()+5);
                break;
        }
    }

    public boolean collision(Map terrain){

        int position = (this.getX()/40)+(this.getY()/40*25);
        if(position % 25 == 0 || position % 25 == 24 || position > 0 && position < 25 || position > 350 && position < 375)
            return false;
        return true;
    }
}
