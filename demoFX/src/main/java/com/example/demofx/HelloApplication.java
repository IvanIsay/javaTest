import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear un cuadro de texto
        TextField textField = new TextField();
        textField.setPromptText("Escribe algo aquí");

        // Crear un botón
        Button button = new Button("Presionar");
        button.setOnAction(event -> {
            // Mostrar un mensaje con el texto ingresado
            System.out.println("Texto ingresado: " + textField.getText());
        });

        // Crear una etiqueta
        Label label = new Label("Hola, JavaFX!");

        // Crear un VBox para organizar los elementos
        VBox vbox = new VBox(10, label, textField, button);

        // Crear una escena y agregar el VBox
        Scene scene = new Scene(vbox, 300, 200);

        // Configurar la ventana principal
        primaryStage.setTitle("Interfaz de Usuario Simple");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
