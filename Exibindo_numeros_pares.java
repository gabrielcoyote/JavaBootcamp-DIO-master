package Fundamentos_Aritméticos_em_java;

import java.util.Scanner;

// Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.
// Exiba todos os números pares até o valor de entrada, sendo um em cada linha.

public class Exibindo_numeros_pares {

    public static void main(String[] args) {

        // contador faz o loop e numero recebe a entrada

        int contador = 0;
        int numero = 0;

        // Scanner le o numero e passa como um inteiiro

        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();

        // contador recebe os numeros com resto da divisão e imprimi

        while (contador < numero) {
            contador++;
            if (contador % 2 == 0)
                System.out.println(contador);

        }

    }
}
