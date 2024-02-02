package com.kamatech.buscadortemperatura.buscacidade;

public class CidadeDTO {
  private String name;
  private double latitude;
  private double longitude;
  private String timezone;
  private String country;

  public String getName() {
    return name;
  }

  public void setNome(String nome) {
    this.name = nome;
  }

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

  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timeZone) {
    this.timezone = timeZone;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

}
