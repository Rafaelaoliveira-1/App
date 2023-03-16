package com.rafaela.myapp;

import com.rafaela.myapp.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MyappApplication implements CommandLineRunner {
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Rafaela", "rafaela.oliveira", "1234567");
		Usuario u2 = new Usuario(null, "Apollo", "apollo.oliveira", "12345678");
		usuarioRepository.saveAll(Arrays.asList(u1,u2));
	}
}
