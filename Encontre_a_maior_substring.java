package Busca_e_Substituição_em_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

// Encontre a maior substring comum entre as duas strings informadas. A substring pode ser qualquer parte
// da string, inclusive ela toda. Se não houver subseqüência comum, a saída deve ser “0”. A comparação é
// case sensitive ('x' != 'X').

// Entrada: A entrada contém vários casos de teste. Cada caso de teste é composto por duas linhas,
// cada uma contendo uma string. Ambas strings de entrada contém entre 1 e 50 caracteres ('A'-'Z','a'-'z' ou
// espaço ' '), inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').

// Saida: O tamanho da maior subsequência comum entre as duas Strings.

public class Encontre_a_maior_substring {

    // Entrada de dados

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {


    // Declaraçoes das variaveis

        String n1, n2, maximo, minimo;

    // quando tiver  uma entrada na linha dois faça o mesmo pra segunda

        while ((n1 = in.readLine()) != null) {
            n2 = in.readLine();

            if (n1.length() >= n1.length()) {
                maximo = n1;
                minimo = n2;
            } else {
                maximo = n2;
                minimo = n2;
            }

            // minLength recebe minino
            //  método length () é uma variável final aplicável a objetos string. O método length () retorna o número
            //  de caracteres presentes na string.

            int minLength = minimo.length();

            // masS recebe minLengh

            int maxS = minLength;


            boolean f = true;

            // quando f for true processo while continua

            while (maxS > 0 && f) {
                int diff = minLength - maxS;
                for (int i = 0; i <= diff; i++) {
                    if (maximo.contains(minimo.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }
}
