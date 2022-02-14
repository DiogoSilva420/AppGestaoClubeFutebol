import java.util.ArrayList;

public class Clube {

    public String Designacao;
    public ArrayList<Jogador> Jogadores;

    public Clube(){}

    public Clube(String designacao, ArrayList<Jogador> jogadores){
        this.Designacao = designacao;
        this.Jogadores = (ArrayList) jogadores.clone();
    }

    public ArrayList<Jogador> getJogadores() {
        return Jogadores;
    }

    public String getDesignacao() {
        return Designacao;
    }

    public void setDesignacao(String designacao) {
        Designacao = designacao;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        Jogadores = jogadores;
    }
}
