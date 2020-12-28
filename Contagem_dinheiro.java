package Fundamentos_Aritméticos_em_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) onde o valor
// pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1. Na sequência mostre
// o valor lido e a relação de notas necessárias.

//Entrada: Você receberá um valor inteiro N (0 < N < 1000000).

//Saída: Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, seguindo o exemplo
// de saída abaixo Após cada linha deve ser imprimido o fim de linha.

public class Contagem_dinheiro {

    public static void main(String[] args) throws IOException {

        //Entrada de dados

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //Variavel que recebe a entrada

        int valorLido = Integer.parseInt(st.nextToken());
        int valor = valorLido;

        //Declaraçoes dos Array

        int[] qtdNotas = new int[7];
        int[] valores = {100, 50, 20, 10, 5, 2, 1};

        //foi feito  um if para cada item do array valores

        if(valor > 100){
            qtdNotas[0] = valor / 100;
            valor = valor % 100;
        }if(valor >= 50){
            qtdNotas[1] = valor / 50;
            valor = valor % 50;
        }if(valor >= 20){
            qtdNotas[2] = valor / 20;
            valor = valor % 20;
        }if(valor >= 10){
            qtdNotas[3] = valor / 10;
            valor = valor % 10;
        }if(valor >= 5){
            qtdNotas[4] = valor / 5;
            valor = valor % 5;
        }if(valor >= 2){
            qtdNotas[5] = valor / 2;
            valor = valor % 2;
        }if(valor >= 1){
            qtdNotas[6] = valor;
        }

        // imprimi um valor digitado inicialmente

        System.out.println(valorLido);

        //for imprimindo cada uns dos resultados obtidos no if

        for(int i=0; i < 7; i++ ){
            System.out.println(qtdNotas[i] + " nota(s) de R$ " + valores[i] + ",00");
        }
    }
}
