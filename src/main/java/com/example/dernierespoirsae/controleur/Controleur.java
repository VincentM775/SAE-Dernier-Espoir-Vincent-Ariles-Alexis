package com.example.dernierespoirsae.controleur;
import com.example.dernierespoirsae.modele.*;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.fxml.Initializable;
import java.util.ResourceBundle;

import java.net.URL;



public class Controleur implements Initializable {
    @FXML
    private TilePane mapPane;
    @FXML
    private Pane persoPane;
    @FXML
    private Pane premierPane;

    private Circle cercle;

    public void initialize(URL location, ResourceBundle ressource) {
        Map map = new Map(375);
        cercle = new Circle(100, 100, 50);
        cercle.setFill(Color.BLUE);
        persoPane.getChildren().add(cercle);
        Environnement e = new Environnement(map);
        afficherMap(map.getMap());
//        placerPerso();
    }


    public void afficherMap(ObservableList<Integer> map) {
        for (int x = 0; x < map.size(); x++) {
            ImageView imageView = new ImageView();
            switch (map.get(x)) {
                case 0:
                    Image image = new Image("file:src/main/resources/com/example/dernierespoirsae/images/Grass_02_v2.png");
                    imageView.setImage(image);
                    imageView.setFitWidth(39);
                    imageView.setFitHeight(39);
                    break;
            }
            mapPane.getChildren().add(imageView);
        }
    }

//    public void placerPerso(){
//        Circle cercle = new Circle(50, 50, 100);
//        cercle.setFill(Color.BLUE);
//        persoPane.getChildren().add(cercle);
//    }

    public void persoKeyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getCode()){
            case Q -> cercle.setTranslateX(cercle.getTranslateX()-5);
            case D -> cercle.setTranslateX(cercle.getTranslateX()+5);
            case Z -> cercle.setTranslateY(cercle.getTranslateY()-5);
            case S -> cercle.setTranslateY(cercle.getTranslateY()+5);
        }
    }

    public void mouseClicked(MouseEvent mouseEvent) {
        persoPane.requestFocus();
    }
}