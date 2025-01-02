package com.example.interactivetelecomhistory;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Carregando o FXML e garantindo que o tipo correto de raiz seja utilizado
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();  // Usando Parent, que é a classe mãe de todos os layouts
        Scene scene = new Scene(root, 800, 600);

        // Adicionando o CSS ao Scene
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        stage.setTitle("Histórico das Telecomunicações");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
