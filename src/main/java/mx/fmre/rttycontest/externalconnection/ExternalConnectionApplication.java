package mx.fmre.rttycontest.externalconnection;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExternalConnectionApplication {

	public static void main(String[] args) {
    	TimeZone.setDefault(TimeZone.getTimeZone("America/Mexico_City"));
		SpringApplication.run(ExternalConnectionApplication.class, args);
	}

}
