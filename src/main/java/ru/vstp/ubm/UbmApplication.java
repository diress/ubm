package ru.vstp.ubm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.vstp.ubm.document.DocumentService;
import ru.vstp.ubm.model.Document;

@SpringBootApplication
public class UbmApplication {

	public static void main(String[] args) {
		SpringApplication.run(UbmApplication.class, args);
	}
}
