import java.util.ArrayList;

public class Jogador {

    public String Nome;
    public int Idade;
    public String Morada;
    public double Peso;
    public double Altura;
    public int NCamisola;
    public String Posicao;
    public double Renumeracao;


    public Jogador() {
    }

    public Jogador(String nome, int idade, String morada, double peso, double altura, int nCamisola, String posicao, double renumeracao) {
        this.Nome = nome;
        this.Idade = idade;
        this.Morada = morada;
        this.Peso = peso;
        this.Altura = altura;
        this.NCamisola = nCamisola;
        this.Posicao = posicao;
        this.Renumeracao = renumeracao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getMorada() {
        return Morada;
    }

    public void setMorada(String morada) {
        Morada = morada;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public int getNCamisola() {
        return NCamisola;
    }

    public void setNCamisola(int NCamisola) {
        this.NCamisola = NCamisola;
    }

    public String getPosicao() {
        return Posicao;
    }

    public void setPosicao(String posicao) {
        Posicao = posicao;
    }

    public double getRenumeracao() {
        return Renumeracao;
    }

    public void setRenumeracao(double renumeracao) {
        Renumeracao = renumeracao;
    }

    @Override
    public String toString() {
        return "=====Jogador=====" +
                "Nome: " + Nome + '\n' +
                "Idade: " + Idade + '\n' +
                "Morada: " + Morada + '\n' +
                "Peso: " + Peso + '\n' +
                "Altura: " + Altura + '\n' +
                "NCamisola: " + NCamisola + '\n' +
                "Posicao: " + Posicao + '\n' +
                "Renumeracao: " + Renumeracao + '\n';
    }

    public double MassaC(){
        return (Peso/(Altura*Altura));
    }

    public double SalarioAnual(){
        return (Renumeracao*14);
    }

}
