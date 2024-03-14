package Fundamentos.Operadores;

public class Ternario {
    public static void main(String[] args) {
         double media = 4.7;
         String resultadoFinal = media >= 7 ? "aprovado." : "reprovado.";
         System.out.println("O aluno está " + resultadoFinal);

         double nota = 9.0;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "sim" : "nao";

        System.out.println("Tem desconto? " + resultado);

         
    }
}
