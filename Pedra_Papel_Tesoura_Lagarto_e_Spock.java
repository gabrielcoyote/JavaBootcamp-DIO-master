package Busca_e_Substituição_em_Java;

import java.util.HashMap;
import java.util.Scanner;

// Pedra-papel-tesoura-lagarto-Spock é uma expansão do clássico método de seleção em jogo de pedra-papel-tesoura.
// Atua sob o mesmo princípio básico, mas inclui outras duas armas adicionais: o lagarto (formado pela mão
// igual a uma boca de fantoche) e Spock (formada pela saudação dos vulcanos em Star Trek). Isso reduz as
// chances de uma rodada terminar em um empate. O jogo foi inventado por Sam Kass e Karen Bryla, como "Rock
// Paper Scissors Lizard Spock". As regras de vantagem são as seguintes:

// Tesoura corta papel
// Papel cobre pedra
// Pedra derruba lagarto
// Lagarto adormece Spock
// Spock derrete tesoura
// Tesoura prende lagarto
// Lagarto come papel
// Papel refuta Spock
// Spock vaporiza pedra
// Pedra quebra tesoura

//Um dia, duas amigas, Fernanda e Marcia, decidiram apostar quem pagaria um almoço para o outro, com
// esta brincadeira. Sua missão será fazer um algoritmo que, baseado no que eles escolherem, informe quem
// irá ganhar ou se dará empate.

// Entrada: Haverá diversos casos de teste. O primeiro número a ser lido será um inteiro, representando a quantidade de
// casos de teste. Cada caso de teste tem duas palavras, representando a escolha de Fernanda e de Marcia,
// respectivamente.

// Saída: Para cada caso de teste, imprima quem venceu, ou se houve empate.

public class Pedra_Papel_Tesoura_Lagarto_e_Spock {

    public static void main(String[] args) {

        // Entrada de dados

        Scanner scanner = new Scanner(System.in);
        int rodadas = scanner.nextInt();
        scanner.nextLine();

        // declaração das variaveis

        String inputStr[];
        String fernanda, marcia;

        // HashMap trabalha com o conceito de key-value pairs, ou seja, cada elemento de sua lista
        // possui uma chave e valor associado

        HashMap<String, String[]> JOKENPO_Rules = initializeJOKENPOHashMap();
        String values[];

        int count = 0;

        // quando contador menor que o numero de rodadas while continua

        while (count < rodadas) {

            inputStr = scanner.nextLine().split(" ");
            fernanda = inputStr[0];
            marcia = inputStr[1];

        // definindo empate ganhador e perdedor

            if (fernanda.toLowerCase().equals(marcia.toLowerCase())) {
                System.out.println("empate");
            } else {
                values = JOKENPO_Rules.get(fernanda.toLowerCase());

                if (values[0].equals(marcia.toLowerCase()) || values[1].equals(marcia.toLowerCase())) {
                    System.out.println("fernanda");
                } else {
                    System.out.println("marcia");
                }
            }

            ++count;
        }

        scanner.close();
    }

    static HashMap<String, String[]> initializeJOKENPOHashMap() {

        // atraves do Hashmap dando atribuimos o valor atraves das chaves e determinamos os vencedores

        HashMap<String, String[]> JOKENPO_Rules = new HashMap<>();

        String values[] = new String[2];
        values[0] = "tesoura";
        values[1] = "lagarto";
        JOKENPO_Rules.put("pedra", values);

        values = new String[2];
        values[0] = "pedra";
        values[1] = "spock";
        JOKENPO_Rules.put("papel", values);

        values = new String[2];
        values[0] = "papel";
        values[1] = "lagarto";
        JOKENPO_Rules.put("tesoura", values);

        values = new String[2];
        values[0] = "spock";
        values[1] = "papel";
        JOKENPO_Rules.put("lagarto", values);

        values = new String[2];
        values[0] = "tesoura";
        values[1] = "pedra";
        JOKENPO_Rules.put("spock", values);

        return JOKENPO_Rules;
    }
}
