package AppdeMensagem;

public class MSNMessenger extends ServicoMensageminstantanea {

    protected void validarConexao() {
        System.out.println("validando conexão com o MSN Messenger");
    }

    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem pelo MSN Messenger");
        salvandohistorico();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }

}
