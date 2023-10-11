package iphone;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.Internet;
import funcionalidades.RepodutorMusicial;

public class Smartphone implements RepodutorMusicial, AparelhoTelefonico, Internet {
    //aparelho telefonico
    @Override
    public void ligar() {
        System.out.println("Ligando!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone!");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Chamada encaminhada para caixa de mensagem, grave seu recado!");
    }

    // internet
    @Override
    public void exibirPagina() {
        System.out.println("Pagina Aberta!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova pagina adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }
    // reprodutor musical
    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica!");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada!");
    }
}
