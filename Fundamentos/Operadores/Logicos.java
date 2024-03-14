package Fundamentos.Operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2);//E lógico
        System.out.println(condicao1 || condicao2);//OU lógico
        System.out.println(condicao1 ^ condicao2);// OU exclusivo / XOR
        System.out.println(!condicao1);
        System.out.println(!condicao2);
        System.out.println(condicao1 && !condicao2);//mistura de operadores
        System.out.println(!!condicao1);//dupla negação,reverte 2x o resultado


        System.out.println("Tabela verdade E(AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        //System.out.println(false && true);
        //System.out.println(false && false);

        System.out.println("Tabela verdade OU(OR)");
        //System.out.println(true || true);
        //System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("Tabela verdade OU exclusivo(XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
    }
}
