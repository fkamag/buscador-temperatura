package com.kamatech.buscadortemperatura.buscatemperatura;

public class TemperaturaDTO {
  private double latitude;
  private double longitude;
  private double elevation;
  private CurrentWeather current_weather;

  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  public double getElevation() {
    return elevation;
  }

  public void setElevation(double elevation) {
    this.elevation = elevation;
  }

  public CurrentWeather getCurrent_weather() {
    return current_weather;
  }

  public void setCurrent_weather(
      CurrentWeather current_weather) {
    this.current_weather = current_weather;
  }
}
