package br.com.tabelaFipe.View;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class TabelaFipeApplication implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		Menu menu = new Menu();
		menu.menu();
	}

	public static void main(String[] args) {
		SpringApplication.run(TabelaFipeApplication.class, args);
	}

}
