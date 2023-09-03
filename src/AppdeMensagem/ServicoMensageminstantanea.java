package AppdeMensagem;

public abstract class ServicoMensageminstantanea {

    protected abstract void validarConexao();

    public abstract void enviarMensagem ();

    public abstract void receberMensagem();

    protected void salvandohistorico() {
        System.out.println("Mensagem Salvada no Histórico");
    }




}

