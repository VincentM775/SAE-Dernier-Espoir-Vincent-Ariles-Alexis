package com.example.dernierespoirsae.modele;

public class Environnement {

    private int map[][];
    public Environnement(int ligne, int colonne){
        creerMap(ligne, colonne);
    }

    public void creerMap(int ligne, int colonne){
        this.map = new int[ligne][colonne];
        for(int i = 0; i < ligne; i++){
            for(int y = 0; y < colonne; y++){
                this.map[i][y] = 0;
            }
        }

    }

    public void afficherMap(){
        for(int i = 0; i < this.map.length; i++){
            for(int y = 0; y < this.map[i].length; y++){
                System.out.print(this.map[i][y]);
            }
            System.out.println();
        }
    }

}