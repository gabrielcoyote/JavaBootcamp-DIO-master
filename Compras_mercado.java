package Ordenação_Filtros_em_Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// Pedro trabalha sempre até tarde todos os dias, com isso tem pouco tempo tempo para as tarefas doméstica.
// Para economizar tempo ele faz a lista de compras do supermercado em um aplicativo e costuma anotar
// cada item na mesma hora que percebe a falta dele em casa. O problema é que o aplicativo não exclui itens
// duplicados, como Pedro anota o mesmo item mais de uma vez e a lista acaba ficando extensa.
// Sua tarefa é melhorar o aplicativo de notas desenvolvendo um código que exclua os itens duplicados da lista
// de compras e que os ordene alfabeticamente.

//Entrada: A primeira linha de entrada contém um inteiro N (N < 100) com a quantidade de casos de teste
// que vem a seguir, ou melhor, a quantidade de listas de compras para organizar. Cada lista de compra
// consiste de uma única linha que contém de 1 a 1000 itens ou palavras compostas apenas de letras minúsculas
// (de 1 a 20 letras), sem acentos e separadas por um espaço.

//Saída: A saída contém N linhas, cada uma representando uma lista de compra,
// sem os itens repetidos e em ordem alfabética.

public class Compras_mercado {

    public static void main(String[] args) {

        //Entrada de dados

        Scanner scr = new Scanner(System.in);
        String produtos;

        //declaração do ArrayList

        ArrayList listaProdutos = new ArrayList<Object>() {


            @Override
            public String toString() {
                StringBuilder stb = new StringBuilder();
                for (int i = 0; i < this.size(); i++) {
                    stb.append(this.get(i) + " ");
                }

                return stb.toString();
            }
        };

        // TreeSet<>(); não permite palavras repetidas

        Set<String> set = new TreeSet<>();

        // entrada do numero de linhas

        int N = scr.nextInt();

        scr.nextLine();

        for (int i = 0; i <N; i++) {

            // adiciona os itens da lista

            produtos = scr.nextLine();
            String[] produto = produtos.split(" ");

            // passa por todos os itens da lista

            for (int j = 0; j < produto.length; j++) {
                set.add(produto[j].toLowerCase());
            }

            // O método size() da interface List em Java é usado para obter o número de elementos nesta lista.
            // append = comando para escrever na última linha da tabela exemplo tabela a: linha 1: xxx linha 2: xxx

            List<String> listaP = new ArrayList<String>() {
                @Override
                public String toString() {
                    StringBuilder stb = new StringBuilder();
                    for (int i = 0; i < this.size(); i++) {
                        stb.append(this.get(i) + " ");
                    }

                    return stb.toString();
                }
            };

            // navega em todos os itens do iterador

            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()) {
                listaP.add(iterator.next());
            }

            // adiciona a listaP a listaProdutos

            listaProdutos.add(listaP);

            set.clear();
        }

        // imprimi todos os itens

        listaProdutos.forEach(System.out::println);

        scr.close();
    }

}
