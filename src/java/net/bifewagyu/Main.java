package net.bifewagyu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {

    public void start(Stage janela) throws IOException {
        // Faz o carregamento do arquivo em resources/calculandosoma.fxml
        // Seta o tamanho da janela
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/calculandosoma.fxml"));
        Scene scene = new Scene(loader.load(), 600, 400);
        janela.setScene(scene);
        // Titulo e colocando pra mostrar
        janela.setTitle("Soma dos numeros");
        // remover a opção de maximizar tela
        janela.setResizable(false);
        // mostrar a janela
        janela.show();




    }


    public static void main(String[] args) {
        launch(args);

    }
}
