package com.example.celular.strategy;

import org.springframework.stereotype.Component;

@Component("sms")
public class EnviarSMS implements EnviarMensagemStrategy {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando SMS para " + destinatario + ": " + mensagem);
    }
}
