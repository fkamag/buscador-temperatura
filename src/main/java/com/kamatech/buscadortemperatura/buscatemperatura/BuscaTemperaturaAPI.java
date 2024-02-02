package com.kamatech.buscadortemperatura.buscatemperatura;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("tempo")
public class BuscaTemperaturaAPI {



  @GetMapping("{latitude}&{longitude}")
  public TemperaturaDTO buscaTemperatura(@PathVariable("latitude")
      String latitude, @PathVariable("longitude") String longitude) {
    RestTemplate restTemplate = new RestTemplate();
    String url = String.format(
        "https://api.open-meteo.com/v1/forecast?latitude=%s&longitude=%s&&current_weather=true",
        latitude, longitude
    );
    ResponseEntity<TemperaturaDTO> result =
        restTemplate.getForEntity(url, TemperaturaDTO.class);
    return result.getBody();
  }

}
