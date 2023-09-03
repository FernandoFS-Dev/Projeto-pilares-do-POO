package AppdeMensagem;

public class FacebookMessenger extends ServicoMensageminstantanea {

    public void validarConexao() {
        System.out.println("validando conexão com o Facebook Messenger");
    }

    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }
}
