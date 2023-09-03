package AppdeMensagem;

public class FacebookMessenger extends ServicoMensageminstantanea {

    protected void validarConexao() {
        System.out.println("validando conexão com o Facebook Messenger");
    }

    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
        salvandohistorico();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }
}
