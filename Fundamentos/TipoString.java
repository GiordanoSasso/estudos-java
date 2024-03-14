package Fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(4));

        String s = "Boa tarde";
        //formas de fazer a concatenação entre uma variavel e String
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");

        //forma de verificação se o valor da String é true ou falso.
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("boa"));

        //forma de verificar quantos caracteres tem na String
        System.out.println(s.length());

        //forma de comparação de igualdades
        System.out.println(s.equals("boa tarde"));//neste cenário é falso pois o equal vai comparar e vai acha a primeira letra maiuscula
        System.out.println(s.equalsIgnoreCase("boa tarde"));
        /*neste cenário é verdadeiro 
        pois o ignoreCase 
        não faz destinção entre maiuscula e minuscula*/

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.println("Nome: " + nome + "\nSobrenome: "
        + sobrenome + "\nIdade: " + idade +
        "\nSalario: " + salario + "\n\n");

        //outra forma de escrever o código acima
        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",nome,sobrenome,idade,salario);
        /*
         * %s = String
         * %d = valor inteiro
         * %f = valor flutuante
         */

    }
}
