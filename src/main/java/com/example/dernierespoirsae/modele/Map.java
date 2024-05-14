package com.example.dernierespoirsae.modele;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Map {
    private ObservableList<Integer> map;

    public Map(int n) {
        this.map = FXCollections.observableArrayList();;
        //créer une map
        for(int i = 0; i < n; i++){
            this.map.add(0);
        }
    }

    public ObservableList<Integer> getMap() {
        return map;
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
}
