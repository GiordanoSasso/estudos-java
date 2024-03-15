package Classe;

public class PrimeiroTrauma {
    int a = 3;//não pode mexer aqui!
    public static void main(String[] args) {
        PrimeiroTrauma p = new PrimeiroTrauma();
        System.out.println(p.a);
//só posso acessar o método se criar uma instância para ele,pois a mesma não é estática.
    }
}
