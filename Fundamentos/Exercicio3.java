package Fundamentos;

import java.util.Scanner;

public class Exercicio3 {
    //Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira seu peso: ");
        double peso = entrada.nextDouble();

        System.out.println("Insira a sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O seu Indíce de Massa Corporal(IMC) é: " + imc);
        
        
        
        
        
        entrada.close();
    }
}
