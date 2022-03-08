package com.numerosmega;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class NumerosMegaApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NumerosMegaApplication.class.getResource("numerosmega-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 130);
        stage.setTitle("Gerador Mega-Sena");
        stage.getIcons().add(new Image(Objects.requireNonNull(NumerosMegaApplication.class.getResourceAsStream("icon.png"))));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}