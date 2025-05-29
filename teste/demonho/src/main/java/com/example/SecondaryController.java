package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SecondaryController {

    @FXML
    TextField tfPeso;

    @FXML
    TextField tfAltura;

    @FXML
    Label lbResultado;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    

    @FXML
    private void calculaImc() throws IOException {
        double p,a,i;
        System.out.println("Clicou!");
        a = Double.parseDouble(tfAltura.getText());
        p = Double.parseDouble(tfAltura.getText());
        i = p/(a*a);
        System.out.println("IMC:" + i);
        lbResultado.setText("IMC:" + i);
    }
}