package Fundamentos;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
	/** 1. Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit. */

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite a temperatura em Celsius: ");
    double celsius = entrada.nextDouble();

    double conversao = celsius * 1.8 + 32;
    System.out.println("A temperatuda em Farenheit é: " + conversao);

    entrada.close();

    }
}
