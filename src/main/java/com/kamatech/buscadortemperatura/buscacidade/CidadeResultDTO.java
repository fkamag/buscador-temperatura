package com.kamatech.buscadortemperatura.buscacidade;

import java.util.ArrayList;

public class CidadeResultDTO {
  private ArrayList<CidadeDTO> results = new ArrayList<>();

  public ArrayList<CidadeDTO> getResults() {
    return results;
  }

  public void setResults(ArrayList<CidadeDTO> results) {
    this.results = results;
  }

}
