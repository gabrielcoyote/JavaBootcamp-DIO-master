package Busca_e_Substituição_em_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

// Crie um algoritmo para ordenar um conjunto de palavras pelo seu tamanho. Seu programa deve receber um
// conjunto de palavras e retornar este mesmo conjunto ordenado pelo tamanho das palavras decrescente,
// se o tamanho das palavras for igual, deve-se ordernar por ordem alfabética.

// Entrada: A primeira linha da entrada possui um único inteiro N, que indica o número de casos de teste.
// Cada caso de teste poderá conter de 1 a 50 palavras inclusive, e cada uma das palavras poderá conter
// entre 1 e 50 caracteres inclusive. Os caracteres poderão ser espaços, letras, ou números.

// Saída: A saída deve conter o conjunto de palavras da entrada ordenado pelo tamanho das palavras e caso
// o tamanho das palavras for igual, deve-se ordernar por ordem alfabética.. Um espaço em branco deve
// ser impresso entre duas palavras.

public class Ordenação_de_palavras_por_tamanho {

    public static void main(String[] args) throws IOException {

        // Entrada de dados

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());

        // iniciando os array

            List<String> palavras = new ArrayList<>();
            List<Integer> tamanhoPalavra;
            List<String> palavra;

            StringTokenizer st;

        // for sera executado ate acabar os casos de testes determinado ´por "N"

            for (int i = 0; i < N; i++) {

                st = new StringTokenizer(br.readLine());
                while (st.hasMoreTokens()) {
                    palavras.add(st.nextToken());
                }

                //Retorna a  quantidade de letra de cada nome

                tamanhoPalavra = palavras.stream()
                        .map(estudante
                                -> estudante.length())
                        .collect(Collectors.toList());

                palavra = palavras.stream()
                        .collect(Collectors.toList());

                List<objPalavras> objP = new ArrayList<>();

                for (int j = 0; j < palavras.size(); j++) {
                    objPalavras pal = new objPalavras(tamanhoPalavra.get(j), palavra.get(j));
                    objP.add(pal);
                }

                Collections.sort(objP, (objPalavras c1, objPalavras c2) -> {
                    int cmp = Double.compare(c2.getTamPalavra(), c1.getTamPalavra());
                    if (cmp == 0) {

                        //desempata na de menor preço

                        cmp = c1.getPalavra().compareTo(c2.getPalavra());
                    }
                    return cmp;
                });

                for (int j = 0; j < objP.size(); j++) {
                    if ((j + 1) != objP.size()) {
                        System.out.print(objP.get(j).getPalavra() + " ");
                    } else {
                        System.out.print(objP.get(j).getPalavra());
                    }
                }
                System.out.println("");
                palavras.clear();
            }
        }
    }

    public static final class objPalavras {

        private int tamPalavra;
        private String palavra;

        public objPalavras(int tamPalavra, String palavra) {
            this.setTamPalavra(tamPalavra);
            this.setPalavra(palavra);
        }

        /**
         * @return the tamPalavra
         */
        public int getTamPalavra() {
            return tamPalavra;
        }

        /**
         * @param tamPalavra the tamPalavra to set
         */
        public void setTamPalavra(int tamPalavra) {
            this.tamPalavra = tamPalavra;
        }

        /**
         * @return the palavra
         */
        public String getPalavra() {
            return palavra;
        }

        /**
         * @param palavra the palavra to set
         */
        public void setPalavra(String palavra) {
            this.palavra = palavra;
        }
    }
}
