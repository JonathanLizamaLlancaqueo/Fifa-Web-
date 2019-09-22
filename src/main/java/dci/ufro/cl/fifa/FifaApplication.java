package dci.ufro.cl.fifa;

import dci.ufro.cl.fifa.model.ListPlayer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class FifaApplication {

	public static void main(String[] args) throws IOException {
		ListPlayer consola = new ListPlayer();
		ListPlayer.addPlayer();
		SpringApplication.run(FifaApplication.class, args);
	}
}
