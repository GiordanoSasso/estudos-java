package Fundamentos;

import java.util.Scanner;

public class Exercicio5 {
    //Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor da base: ");
        double valorBase = entrada.nextDouble();

        System.out.println("Digite a altura do triângulo: ");
        double altTriang = entrada.nextDouble();

        double areaTriang = (valorBase * altTriang) / 2;

        System.out.println("A área do triângulo é: " + areaTriang);
        
        entrada.close();
    }
}
