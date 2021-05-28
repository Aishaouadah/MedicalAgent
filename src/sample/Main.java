package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;

public class Main extends Application {
    Scene scene1,scene2,scene3,scene4,scene5,main;
    private static Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            Parent root = FXMLLoader.load(getClass().getResource("fxml/Main.fxml"));
            Scene scene = new Scene(root);
            stage = primaryStage;
            primaryStage.setTitle("SAT Solver ");
            primaryStage.initStyle(StageStyle.DECORATED);
            primaryStage.setResizable(false);
            primaryStage.setScene(scene);
            primaryStage.show();
            }
            catch (HeadlessException e) {
            e.printStackTrace();
        }

    }



    public static void main(String[] args) {
            launch(args);
    }
}
