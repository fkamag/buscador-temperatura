package com.kamatech.buscadortemperatura.buscacidade;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("consulta")
public class BuscaCidadeAPI {

  @GetMapping("{city}")
  public CidadeResultDTO buscaCidade (@PathVariable("city") String city) {
    RestTemplate restTemplate =  new RestTemplate();
    String url = String.format(
        "http://geocoding-api.open-meteo.com/v1/search?language=pt_BR&name=%s",
        city);
    ResponseEntity<CidadeResultDTO> result =
        restTemplate.getForEntity(url, CidadeResultDTO.class);
    return result.getBody();
  }

}
