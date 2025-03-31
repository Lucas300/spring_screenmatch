package br.com.alura.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.screenmatch.service.ConsumoApi;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	var consumoApi = new ConsumoApi();
	var json = consumoApi.obterDados("https://www.omdbapi.com/?i=tt3896198&apikey=c7d1145e");
	System.out.println(json);
		
	}

}
