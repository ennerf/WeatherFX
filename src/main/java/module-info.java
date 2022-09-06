module ca.pragmaticcoding.weather {
    requires javafx.controls;
    requires javafx.fxml;
    requires javax.inject;
    requires java.annotation;
    requires okhttp3;
    requires com.google.gson;
    requires afterburner.fx;

    exports ca.pragmaticcoding.weather.external;
    exports ca.pragmaticcoding.weather.model;
    exports ca.pragmaticcoding.weather.views;
    exports ca.pragmaticcoding.weather;
}