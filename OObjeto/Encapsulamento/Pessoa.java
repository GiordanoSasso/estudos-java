package OObjeto.Encapsulamento;

public class Pessoa {
    private int idade;

    public Pessoa(int idade) {
        alterarIdade(idade);
    }

    public void alterarIdade(int novaIdade) {
        if(novaIdade >= 0) {
            this.idade = novaIdade;
        }
        
        
       
    }

    public int lerIdade()  {
        return idade;
    }


}
