package OObjeto.Encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(-30);
        p1.alterarIdade(-30);

        System.out.println(p1.lerIdade());//ler
    }
}
