package com.example.celular.service;

import com.example.celular.strategy.EnviarMensagemStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class MensagemService {

    @Autowired
    private ApplicationContext context;

    public void enviarMensagem(String tipo, String destinatario, String mensagem) {
        EnviarMensagemStrategy strategy = (EnviarMensagemStrategy) context.getBean(tipo);
        strategy.enviar(destinatario, mensagem);
    }
}
