package com.example.dernierespoirsae.modele;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import java.util.Objects;

public class KeyHandler implements EventHandler<KeyEvent>{
    private Map map;
    
    public KeyHandler(Map map){
        this.map=map;
    }

    @Override
    public void handle(KeyEvent keyEvent){
        switch (keyEvent.getCode()){
            case Q :
                System.out.println("q");
                map.getJoueur().seDeplacer("q");
                break;

            case D :
                System.out.println("d");
                map.getJoueur().seDeplacer("d");
                break;

            case Z : 
                System.out.println("z");
                map.getJoueur().seDeplacer("z");
                break;

            case S : 
                System.out.println("s");
                map.getJoueur().seDeplacer("s");
                break;
                
            default:
                break;
        }
    }

}
