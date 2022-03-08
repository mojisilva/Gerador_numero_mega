package com.numerosmega;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.util.LinkedHashSet;
import java.util.Random;

public class NumerosMegaController {
    Random gerador = new Random(0);
    LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
    String formato;

    @FXML
    private TextField inputTF;

    @FXML
    private Button fecharBT;

    @FXML
    protected void onHelloButtonClick() {
        for (int i = 0; i<6; i++){
            while(numeros.size() <6 ){
                numeros.add(gerador.nextInt(1, 60));
            }
            formato = String.valueOf(numeros);
            inputTF.setText(formato.replace("[", "").replace(",", " -").replace("]", ""));
        }
        numeros.clear();
        fechar();
    }

    private void fechar() {
        fecharBT.setOnAction(ActionEvent -> System.exit(0));
    }
}