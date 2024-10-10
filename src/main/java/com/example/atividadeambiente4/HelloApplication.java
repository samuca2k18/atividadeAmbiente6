package com.example.atividadeambiente4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox; // Importar VBox
import javafx.stage.Stage;
import javafx.scene.web.WebView;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        VBox root = fxmlLoader.load(); // Carregando VBox

        // Botão para abrir nova janela com JavaScript

        Scene scene = new Scene(root, 1280, 720);
        stage.setTitle("Janela Principal");
        stage.setScene(scene);
        stage.show();
    }

    // Método para abrir uma nova janela com WebView (JavaScript)
    public void abrirNovaJanela() throws IOException {
        WebView webView = new WebView();
        webView.getEngine().load(Objects.requireNonNull(getClass().getResource("/webpage.html")).toExternalForm());

        Stage novaJanela = new Stage();
        novaJanela.setTitle("Janela com JavaScript");

        Scene scene = new Scene(webView, 1280, 720);
        novaJanela.setScene(scene);
        novaJanela.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
