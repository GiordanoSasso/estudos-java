package Fundamentos.Operadores;

public class Relacionais {
    public static void main(String[] args) {
        
        System.out.println(7 == 8);
        System.out.println(7 > 10);
        System.out.println(8 >= 8);
        System.out.println(5 < 4);
        System.out.println(5 <= 7);
        System.out.println(30 != 7);

        double nota = 9.0;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("Tem desconto? " + temDesconto);
    }
}
