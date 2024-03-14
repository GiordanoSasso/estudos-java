package Classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;
    
    Produto() {
        //para criar um produto sem passar parâmetro
    }

    
    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;//criando produto e tendo que passar parâmetro
        preco = precoInicial;
    }
    

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }

}
