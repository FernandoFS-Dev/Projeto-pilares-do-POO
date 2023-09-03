package AppdeMensagem;

public class Telegram extends ServicoMensageminstantanea {

    protected void validarConexao() {
        System.out.println("validando conexão com o telegram");
    }

    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem pelo Telegram");
        salvandohistorico();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
