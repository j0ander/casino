package com.casino;
/**
 * =========================
 * MainApp
 * =========================
 *
 * Tipo:
 * - Clase concreta
 *
 * Responsabilidad:
 * - Punto de entrada de la aplicación JavaFX
 * - Inicializa el Stage principal
 * - Carga la vista principal (FXML)
 *
 * Qué NO hace:
 * - No contiene lógica de negocio
 * - No accede a servicios ni repositorios
 *
 * Relaciones:
 * - Usa controllers (JavaFX Controllers)
 * - NO usa directamente la capa service
 *
 * Patrón relacionado:
 * - MVC (componente View / Bootstrap)
 */


import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        // Cargar vista principal
    }

    public static void main(String[] args) {
        launch(args);
    }
}

