package Fundamentos_Aritméticos_em_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares,
//quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados
//são negativos.

// Entrada: Você receberá 5 valores inteiros.

// Saída: Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo
// o final de linha após cada uma.


public class Analise_numeros {

    public static void main(String[] args) throws IOException {

        //Entrada de dados

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //Declaraçoes dos ArrayList

        ArrayList<Integer> entrada = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        ArrayList<Integer> positivo = new ArrayList<>();
        ArrayList<Integer> negativo = new ArrayList<>();

        // for com a posição ja definina ja que sabemos  que são 5 inteiros

        for (int i = 0; i < 5; i++)  {
            st = new StringTokenizer(br.readLine());
            entrada.add(Integer.parseInt(st.nextToken()));

            // um if adicionando cada item a um array de acordo com a logica

            if ( entrada.get(i) % 2 == 0) {
                pares.add(entrada.get(i));
            } else {
                impares.add(entrada.get(i));
            }
            if (entrada.get(i) > 0) {
                positivo.add(entrada.get(i));
            }
            if (entrada.get(i) < 0){
                negativo.add(entrada.get(i));
            }

        }

        //imprimindo com .size() para pegar a quantidades de itens no array

        System.out.println(pares.size() + "  valor(es) par(es)");
        System.out.println(impares.size() + "  valor(es) impar(es)");
        System.out.println(positivo.size() + "  valor(es) positivo(s)");
        System.out.println(negativo.size() + "  valor(es) negativo(s)");

    }
}
