package org.hugo.ejercicion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * La clase HelloApplication es una aplicación JavaFX que representa la ventana principal
 * de la interfaz de usuario. Carga un archivo FXML y establece la escena de la aplicación.
 */
public class AppComponente extends Application {

    /**
     * El metodo start es el punto de entrada de la aplicación JavaFX.
     *
     * @param stage El escenario principal de la aplicación, donde se muestra la escena.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppComponente.class.getResource("EjercicioN.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 650, 450);
        stage.setResizable(false);
        stage.setTitle("EjercicioN");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * El metodo main es el punto de entrada de la aplicación.
     *
     * @param args Los argumentos de línea de comandos pasados a la aplicación.
     */
    public static void main(String[] args) {
        launch();
    }
}
