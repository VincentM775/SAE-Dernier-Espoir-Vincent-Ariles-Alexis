package com.example.dernierespoirsae;

import com.example.dernierespoirsae.modele.Environnement;

public class Lancement {

    public static void main(String[] args) {

        Environnement e = new Environnement(5, 10);

        e.afficherMap();
        e.creationDuneCase();
    }
}
