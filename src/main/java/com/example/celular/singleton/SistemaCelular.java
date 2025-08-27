package com.example.celular.singleton;

import org.springframework.stereotype.Component;

@Component
public class SistemaCelular {

    private String status = "Desligado";

    public void ligar() {
        status = "Ligado";
        System.out.println("Celular está " + status);
    }

    public void desligar() {
        status = "Desligado";
        System.out.println("Celular está " + status);
    }

    public String getStatus() {
        return status;
    }
}
