package com.example.dernierespoirsae.modele;

public class Acteur {
    private Map map;
    private int x;
    private int y;
    private String nom;


    public Acteur(Map map, int x,int y, String nom) {
        this.map = map;
        this.x = x;
        this.y = y;
        this.nom = nom;
    }
    public Acteur(Map map, String nom) {
        x = //TODO;
        y = //TODO;
        this(map,x,y,nom);
    }
    public void seDeplacer(String touche){
        int nbrLigne = map.getMap().size()/15;
        switch (touche){
            case "z" :
                this.position-=nbrLigne;
                break;
            case "d" :
                this.position++;
                break;
            case "s" :
                this.position+=nbrLigne;
                break;
            case "q" :
                this.position--;
                break;

        }
    }
}
