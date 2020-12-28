package Ordenação_Filtros_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

//Crie um programa onde você receberá valores inteiros não negativos como entrada Ordene estes valores de
// acordo com o seguinte critério: Primeiro os Pares Depois os Ímpares
//Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente..

//Entrada: A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000) Este é o número
// de linhas de entrada que vem logo a seguir. As próximas N linhas terão, cada uma delas,
// um valor inteiro não negativo.

//saida: Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso
// em uma linha, conforme exemplo de saída abaixo.


public class Ordenando_pares_impares {

    public static void main(String[] args) throws IOException {

        //Entrada de dados
        //quando o .readline ta na primeira entrada inicia uma posição a frente

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        //declaração do ArrayList

        ArrayList<Integer> Pares = new ArrayList<>(N);
        ArrayList<Integer> Impares = new ArrayList<>(N);
        int num;

        // o for sera feito a executado ate o numero armazeando em "N" seja maior que "i"

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            num = Integer.parseInt(st.nextToken());
            if(num%2 == 0){
                Pares.add(num);
            }else{
                Impares.add(num);
            }
        }

        // Collections coloca os itens do array em ordem crescente (a,b,c) (1,2,3)

        Collections.sort(Pares);

        // Collections.reverserOrder coloca os itens do array em ordem decrecente (c,b,a) (3,2,1)

        Collections.sort(Impares, Collections.reverseOrder());

        // uma impressao no for que garante  todos os itens Pares primeiro depois os impares

        for(int numEven : Pares){
            System.out.println(numEven);
        }

        for(int numOdd : Impares){
            System.out.println(numOdd);
        }
    }

}
