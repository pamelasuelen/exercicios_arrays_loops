package br.com.dio.exercicios.arrays;

/*
Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene
eles em um vetor. Ao final mostre os números e seus sucessores.
*/
import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for ( int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
                numerosAleatorios[i] = numero;
        }

        System.out.print("\nSucessores dos numeros Aleatorios: ");
        for (int numero  : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

        System.out.print("\nNumeros aleatorios: ");
        for (int numero  : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessores dos numeros Aleatorios: ");
        for (int numero  : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }
    }
}
