package com.example.dernierespoirsae.controleur;

import com.example.dernierespoirsae.modele.Environnement;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.fxml.Initializable;
import java.util.ResourceBundle;

import java.net.URL;



public class Controleur implements Initializable{
    @FXML
    private TilePane mapPane;

    public void initialize(URL location, ResourceBundle ressource){
        Environnement e = new Environnement(30, 30);

        e.afficherMap();
        e.creationDuneCase();
        afficherMap(e.getMap());
    }




    public void afficherMap(int[][] map){
        for (int x=0;x<map.length;x++){
            for (int y=0;y<map[x].length;y++){
                Rectangle rectangle = new Rectangle(20,20);
                switch (map[x][y]){
                    case 0 : rectangle.setFill(Color.RED); // Couleur de remplissage
                        break;
                    case 1 : rectangle.setFill(Color.BLUE); // Couleur de remplissage
                }
                mapPane.getChildren().add(rectangle);
            }
        }
    }
}