package com.example.celular.facade;

import com.example.celular.singleton.SistemaCelular;
import com.example.celular.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CelularFacade {

    @Autowired
    private SistemaCelular sistema;

    @Autowired
    private MensagemService mensagemService;

    public void ligarCelular() {
        sistema.ligar();
    }

    public void desligarCelular() {
        sistema.desligar();
    }

    public void enviarSMS(String destinatario, String mensagem) {
        mensagemService.enviarMensagem("sms", destinatario, mensagem);
    }

    public void enviarWhatsApp(String destinatario, String mensagem) {
        mensagemService.enviarMensagem("whatsapp", destinatario, mensagem);
    }

    public SistemaCelular getSistema() {
        return sistema;
    }
}
