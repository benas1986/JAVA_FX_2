package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Label;


import java.util.Random;

public class Controller {
    @FXML
    private TextField input;

    @FXML
    private Label isvedimas;

private int skaiciuoti;

    public void tikrinti(ActionEvent event) {
        String value = input.getText();
        int skaicius = 0;

        try{

        skaicius = Integer.valueOf(value);
            Random rand = new Random();
            int randomNumber = rand.nextInt(10) + 1;

            if (randomNumber != skaicius) {
                isvedimas.setText("Neatspejote skaiciaus " + randomNumber);

            } else {
                isvedimas.setText("Atspejote skaiciu: " + randomNumber);

            }
        }
       catch (NumberFormatException e){
           Alert alert = new Alert(Alert.AlertType.WARNING);
           alert.setContentText("Iveskite skaiciu");
           isvedimas.setText(" ");
           skaiciuoti++;
           if (skaiciuoti >= 5){
               alert.setContentText("5 kartus ivedei ne skaiciu durneli tu");
           }
           alert.show();
       }
    }


    public void baigti(ActionEvent event){
       System.exit(0);
    }



}


