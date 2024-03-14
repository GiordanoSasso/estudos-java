package Fundamentos.Operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        //TRABALHO NA TERÇA (V OU F)
        //TRABALHO NA QUINTA (V OU F)

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean tv50 = trabalho1 && trabalho2;//ok
        boolean tv32 = trabalho1 ^ trabalho2;
        boolean tomarSorvete = trabalho1 || trabalho2;

        System.out.println("Comprou tv 50\"?" + tv50);
        System.out.println("Comprou tv 32\"?" + tv32);
        System.out.println("Comprou TV 32\"Sorvete? " + tomarSorvete);
        
    }
}
