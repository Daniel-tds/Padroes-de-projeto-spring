package com.example.celular.strategy;

import org.springframework.stereotype.Component;

@Component("whatsapp")
public class EnviarWhatsApp implements EnviarMensagemStrategy {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando WhatsApp para " + destinatario + ": " + mensagem);
    }
}
