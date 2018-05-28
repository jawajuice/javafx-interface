package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


    FXMLLoader loader = new FXMLLoader();
        loader.setResources(ResourceBundle.getBundle("sample.resource"));
        Parent root = loader.load(
                getClass().getResourceAsStream(
                        "sample.fxml"
                )
        );


        primaryStage.setTitle("GUI");
        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(400);

        primaryStage.setScene(new Scene(root, 755  , 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }



}
