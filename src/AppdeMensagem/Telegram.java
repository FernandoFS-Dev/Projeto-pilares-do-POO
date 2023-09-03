package AppdeMensagem;

public class Telegram extends ServicoMensageminstantanea {

    public void validarConexao() {
        System.out.println("validando conexão com o telegram");
    }

    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Telegram");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
