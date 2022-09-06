package ca.pragmaticcoding.weather.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

public class WeatherModel {

    private final StringProperty temperature = new SimpleStringProperty("");
    private final StringProperty conditions = new SimpleStringProperty("");
    private final StringProperty city = new SimpleStringProperty("Nice");
    private final ObjectProperty<Image> icon = new SimpleObjectProperty<>();
    private final StringProperty units = new SimpleStringProperty("metric");

    public String getTemperature() {
        return temperature.get();
    }

    public StringProperty temperatureProperty() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature.set(temperature);
    }

    public Image getIcon() {
        return icon.get();
    }

    public ObjectProperty<Image> iconProperty() {
        return icon;
    }

    public void setIcon(Image icon) {
        this.icon.set(icon);
    }

    public String getConditions() {
        return conditions.get();
    }

    public StringProperty conditionsProperty() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions.set(conditions);
    }

    public String getCity() {
        return city.get();
    }

    public StringProperty cityProperty() {
        return city;
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public String getUnits() {
        return units.get();
    }

    public StringProperty unitsProperty() {
        return units;
    }

    public void setUnits(String units) {
        this.units.set(units);
    }
}
