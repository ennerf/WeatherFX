package ca.pragmaticcoding.weather.model;

import ca.pragmaticcoding.weather.external.WeatherData;
import ca.pragmaticcoding.weather.external.WeatherFetcher;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.inject.Inject;
import java.util.concurrent.CompletableFuture;

public class WeatherService {

    public void updateWeather(Runnable onComplete) {
        CompletableFuture
                .supplyAsync(() -> weatherFetcher.checkWeather(viewModel.getCity()))
                .thenAcceptAsync(this::updateViewModel, Platform::runLater)
                .whenCompleteAsync((unused, throwable) -> onComplete.run(), Platform::runLater);
    }

    private void updateViewModel(WeatherData data) {
        viewModel.setTemperature(data.getTemperature());
        viewModel.setConditions(data.getConditions());
        viewModel.setIcon(data.getWeatherImage());
    }

    public ObservableList<String> getCities() {
        return cities;
    }

    @Inject
    WeatherModel viewModel;

    @Inject
    WeatherFetcher weatherFetcher;

    private final ObservableList<String> cities = FXCollections.observableArrayList(
            "London", "Paris", "Nice", "Hong Kong", "New York", "Las Vegas"
    );

}
