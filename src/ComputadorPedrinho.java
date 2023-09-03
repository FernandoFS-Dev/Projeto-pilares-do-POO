import AppdeMensagem.FacebookMessenger;
import AppdeMensagem.MSNMessenger;
import AppdeMensagem.ServicoMensageminstantanea;
import AppdeMensagem.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensageminstantanea smi = null;

        String AppEscolhido = "fbm";

        if (AppEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }
        else if (AppEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        }
        else if (AppEscolhido.equals("tlg")) {
            smi = new Telegram();
        }

        smi.validarConexao();

        smi.enviarMensagem();

        smi.receberMensagem();
    }
}