package com.example.dernierespoirsae.controleur;
import com.example.dernierespoirsae.modele.*;
import javafx.collections.ObservableList;
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



public class Controleur implements Initializable {
    @FXML
    private TilePane mapPane;
    @FXML
    private Pane persoPane;


    public void initialize(URL location, ResourceBundle ressource) {
        Map map = new Map(375);
        Environnement e = new Environnement(map);
//        map.afficherMap();
        afficherMap(map.getMap());
    }


    public void afficherMap(ObservableList<Integer> map) {
        for (int x = 0; x < map.size(); x++) {
            ImageView imageView = new ImageView();
            switch (map.get(x)) {
                case 0:
                    Image image = new Image("file:/home/etudiants/info/abournon/IdeaProjects/DernierEspoirSAE/src/main/resources/com/example/dernierespoirsae/images/Grass_02_v2.png");
                    imageView.setImage(image);
                    imageView.setFitWidth(39);
                    imageView.setFitHeight(39);
                    break;
            }
            mapPane.getChildren().add(imageView);
        }
    }
}