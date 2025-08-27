package com.example.celular;

import com.example.celular.facade.CelularFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CelularApp implements CommandLineRunner {

    @Autowired
    private CelularFacade celularFacade;

    public static void main(String[] args) {
        SpringApplication.run(CelularApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== Testando Singleton ===");
        System.out.println("Status inicial: " + celularFacade.getSistema().getStatus());
        celularFacade.ligarCelular();
        System.out.println("Status após ligar: " + celularFacade.getSistema().getStatus());

        System.out.println("\n=== Testando Strategy/Repository ===");
        celularFacade.enviarSMS("João", "Olá, isso é um teste!");
        celularFacade.enviarWhatsApp("Maria", "Mensagem via WhatsApp!");

        System.out.println("\n=== Testando Facade ===");
        celularFacade.desligarCelular();
        System.out.println("Status após desligar: " + celularFacade.getSistema().getStatus());
    }
}
