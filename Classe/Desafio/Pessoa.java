package Classe.Desafio;

public class Pessoa {
    String nome;
    double peso;

    //Construtor
    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
    void comer(Comida comida) {
        if(comida != null) {
            this.peso += comida.peso;
        }
    }

    String  apresentar() {
        return "OLá eu sou o " + nome + "e tenho " + peso + " Kgs.";
    }
}
