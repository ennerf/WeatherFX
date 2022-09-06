package ca.pragmaticcoding.weather;

import ca.pragmaticcoding.weather.views.WeatherView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WeatherMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setScene(new Scene(new WeatherView().getView()));
        primaryStage.show();
    }

}
