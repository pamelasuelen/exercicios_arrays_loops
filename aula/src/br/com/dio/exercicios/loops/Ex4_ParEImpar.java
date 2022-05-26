package br.com.dio.exercicios.loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++; // quantPares = quantPares +1;
            else quantImpares++;

            count++;
        } while (count < quantNumeros);
        System.out.println("Quantidade de Pares: " + quantPares);
        System.out.println("Quantidade de Impares: " + quantImpares);
    }
}
