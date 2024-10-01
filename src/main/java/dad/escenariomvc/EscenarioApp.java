package dad.escenariomvc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EscenarioApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        ModificarController modificarController = new ModificarController();

        Stage modificarStage = new Stage();
        modificarStage.setTitle("Modificar");
        modificarStage.setScene(new Scene(modificarController.getRoot()));
        modificarStage.show();

        VerController verController = new VerController();

        Stage verStage = new Stage();
        verStage.setTitle("Ver");
        verStage.setScene(new Scene(verController.getRoot()));
        verStage.show();

        verController.valueProperty().bind(modificarController.valueProperty());

    }

}
