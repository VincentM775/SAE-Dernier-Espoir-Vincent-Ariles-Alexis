package com.example.dernierespoirsae.controleur;

import com.example.dernierespoirsae.modele.Environnement;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

    @FXML
    private Pane persoPane;


    public void initialize(URL location, ResourceBundle ressource){
        Environnement e = new Environnement(100, 100);

//        e.afficherMap();
//        e.creationDuneCase();
        afficherMap(e.getMap());
    }




    public void afficherMap(int[][] map){
        for (int x=0;x<map.length;x++){
            for (int y=0;y<map[x].length;y++){
                ImageView imageView = new ImageView();
                switch (map[x][y]){
                    case 0 : Image image = new Image("file:/home/etudiants/info/abournon/IdeaProjects/DernierEspoirSAE/images/Grass_02.png");
                    imageView.setImage(image);
                    imageView.setFitWidth(20);
                    imageView.setFitHeight(20);
                        break;
//                    case 1 : rectangle.setFill(Color.BLUE); // Couleur de remplissage
//                        break;
                }
                mapPane.getChildren().add(imageView);
            }
        }
    }
}