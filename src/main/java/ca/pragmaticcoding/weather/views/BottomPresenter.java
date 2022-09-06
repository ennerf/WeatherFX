package ca.pragmaticcoding.weather.views;

import ca.pragmaticcoding.weather.model.WeatherService;
import ca.pragmaticcoding.weather.model.WeatherModel;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import javax.inject.Inject;
import java.net.URL;
import java.util.ResourceBundle;

public class BottomPresenter implements Initializable {

    @FXML
    private ComboBox<String> cityChoice;

    @FXML
    private Button getWeatherBtn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cityChoice.getItems().setAll(weatherService.getCities());
        viewModel.cityProperty().bind(cityChoice.getSelectionModel().selectedItemProperty());

        BooleanProperty isUpdating = new SimpleBooleanProperty(false);
        getWeatherBtn.disableProperty().bind(isUpdating.or(viewModel.cityProperty().isNull()));
        getWeatherBtn.setOnAction(e -> {
            isUpdating.set(true);
            weatherService.updateWeather(() -> isUpdating.set(false));
        });

    }

    @Inject
    WeatherService weatherService;

    @Inject
    WeatherModel viewModel;

}
