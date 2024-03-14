package Fundamentos.Operadores;

public class Unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a++; // a = a + 1
        a--;//a = a - 1

        ++b;// b = b + 1
        --b;// b = b - 1

        System.out.println("Mini desafio...");
        System.out.println(++a == b--);
        //será true a resposta pois o operador unário na frente da variavel tem precedencia maior em relação a quando está atrás.
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);
    }
}
