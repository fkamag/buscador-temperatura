package com.kamatech.buscadortemperatura;

import com.kamatech.buscadortemperatura.buscacidade.BuscaCidadeAPI;
import com.kamatech.buscadortemperatura.buscacidade.CidadeDTO;
import com.kamatech.buscadortemperatura.buscacidade.CidadeResultDTO;
import com.kamatech.buscadortemperatura.buscatemperatura.BuscaTemperaturaAPI;
import com.kamatech.buscadortemperatura.buscatemperatura.TemperaturaDTO;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuscadorTemperaturaApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SpringApplication.run(BuscadorTemperaturaApplication.class, args);
		BuscaCidadeAPI buscador = new BuscaCidadeAPI();
		CidadeResultDTO listCidades;

		System.out.println("--- Temperatura Agora ---");
		System.out.println("Digite a localidade: ");
		String city = scanner.nextLine();

		listCidades = buscador.buscaCidade(city);

		System.out.println("Escolha a cidade da lista abaixo: ");
		int i = 0;
		for (CidadeDTO localidade : listCidades.getResults()) {
			i += 1;
			System.out.printf("%d - %-20s\t - %-20s\t - %s\n", i, localidade.getName(),
					localidade.getTimezone(), localidade.getCountry());
		}

		System.out.println("Digite a opção escolhida:");
		int option = scanner.nextInt();

		CidadeDTO found = listCidades.getResults().get(option - 1);
		String latitude =  Double.toString(found.getLatitude());
		String longitude = Double.toString(found.getLongitude());

		BuscaTemperaturaAPI buscadorTemperatura = new BuscaTemperaturaAPI();
		TemperaturaDTO temperatura = buscadorTemperatura.buscaTemperatura(latitude, longitude);
		System.out.printf("Temperatura atual de %sºC em %s",
				temperatura.getCurrent_weather().getTemperature(), found.getName());

	}

}
