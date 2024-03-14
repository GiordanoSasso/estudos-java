package Fundamentos;

import java.util.Scanner;

public class Exercicio2 {
    //Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit: ");
        double fahrenheit = entrada.nextDouble();

        double conversao = (fahrenheit - 32) / 1.8;

        System.out.println("a temperatura convertida em Celsius é: " + conversao);

        entrada.close();
    }

}
