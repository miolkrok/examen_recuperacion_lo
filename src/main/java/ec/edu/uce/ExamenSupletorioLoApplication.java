package ec.edu.uce;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamenSupletorioLoApplication implements CommandLineRunner{
	
	private static Logger LOG = Logger.getLogger(ExamenSupletorioLoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ExamenSupletorioLoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
