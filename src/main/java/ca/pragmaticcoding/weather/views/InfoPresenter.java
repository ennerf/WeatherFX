package ca.pragmaticcoding.weather.views;

import ca.pragmaticcoding.weather.model.WeatherModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import javax.inject.Inject;
import java.net.URL;
import java.util.ResourceBundle;

public class InfoPresenter implements Initializable {

    @FXML
    private Text cityText;

    @FXML
    private Text conditionText;

    @FXML
    private ImageView iconImageView;

    @FXML
    private Text temperatureText;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cityText.textProperty().bind(viewModel.cityProperty());
        iconImageView.imageProperty().bind(viewModel.iconProperty());
        conditionText.textProperty().bind(viewModel.conditionsProperty());
        temperatureText.textProperty().bind(viewModel.temperatureProperty());
    }

    @Inject
    WeatherModel viewModel;

}
