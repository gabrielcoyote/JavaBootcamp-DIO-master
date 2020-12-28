package Solução_de_Problemas_com_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

// A nutricionista Juliana Alcantra é uma excelente profissional de sua área. Em determinado dia, ela foi
// entrevistada ao vivo para um jornal da cidade. No entanto, ficou um pouco nervosa na hora, e diante
// da situação, sua fala ficou um pouco distorcida, repetindo o final de cada palavra após dizer a mesma.
// Para que isso não aconteça novamente, ela precisa da sua ajuda para escrever um programa que omita
// a parte repetida, de modo que as palavras sejam pronunciadas como deveriam ser.
//Escreva um programa que, dada uma palavra errada, a mesma seja corrigida.

// Entrada: Haverá diversos casos de teste. Cada caso de teste é formado por uma palavra, de, no máximo, 30
// caracteres, dita da forma errada. A entrada termina com fim de arquivo.

// Saída: Para cada caso de teste, escreva a palavra devidamente corrigida. Analise os exemplos para
// verificar o padrão, de modo a consertar todos os casos.

public class Entrevista_embaraçosa {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static int ler = 0;

    public static String readLine() {
        ler++;

    // um if foi criado para  cada caso

        if (ler ==  1) return "sanduicheiche";
        if (ler ==  2) return "barrilarril";
        if (ler ==  3) return "ratoato";
        if (ler ==  4) return "sol";
        if (ler ==  5) return "coliseueu";
        if (ler ==  6) return "queijoijo";
        if (ler ==  7) return "astroastro";
        if (ler ==  8) return "a";
        if (ler ==  9) return "aaaaaaaaaaaaaa";
        if (ler ==  10) return "abababab";
        if (ler ==  11) return "lalilelolelo";
        if (ler ==  12) return "aaabbbcccbccc";
        if (ler ==  13) return "cafécafe";
        if (ler ==  14) return "1234512345";
        if (ler ==  15) return "aabb aabb ";
        if (ler ==  16) return "aaabbbcccbccc";
        if (ler ==  17) return "aaacbcccbbbcccbccc";
        if (ler ==  18) return "sss";
        if (ler ==  19) return "ss";
        if (ler ==  20) return "12345555555555";
        if (ler ==  21) return "1234555555555";
        if (ler ==  22) return "123455555555";
        if (ler ==  23) return "12345555555";
        if (ler ==  24) return "1234555555";
        if (ler ==  25) return "123455555";
        if (ler ==  26) return "12345555";
        if (ler ==  27) return "1234555";
        if (ler ==  28) return "123455";
        if (ler ==  29) return "12345";
        if (ler ==  30) return "ABCD ABCD ABCD ABCD ABCD ";
        return null;

    }

    public static void sop(String info) {
        System.out.println(info);
    }

    public static void sop(String[] info) {
        for (String dado : info) {
            sop(dado);
        }
    }

    public static String ler() throws IOException {
        return br.readLine();
//       return readLine();

    }

 // metodo da correção

    public static ArrayList<String> corrigir (char[] vet, String orig)  {
        int i,j, l, guarda, conta;
        ArrayList<String> saida = new ArrayList<>();
        String procura = "";
        String trab;
        boolean continua = true;
        guarda = -1;
        i = vet.length - 1;
        l = vet.length;
        procura = vet[i] + procura;
        while ((l >= 0) && (continua) ) {
            l = i - procura.length();
            if (l >= 0) {
                trab = orig.substring(i - procura.length(), i);
//                sop("Palavra " + orig + "   trab " + trab + "  i " + i + "   Procura " + procura+ " Guarda = "+ guarda);
                if (trab.equals(procura)) {
                    saida.add(orig.substring(0, i));
                    guarda = i;
                }
                i--;
                if (i >= 0) {
                    procura = vet[i] + procura;
                }
            }
            else {
                continua = false;
            }
        }
        if (guarda == -1) {
            saida.add(orig);
        }
        return saida;
    }

    // main fara a leitura passando para o metodo

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        String lido;
        ArrayList<String> saida;
        int num;
        int loc;
        char[] lts;

        lido = ler();
        while (lido != null) {
            lido = lido.trim();
            if ((lido.length() > 0) && (lido.length() <= 30)) {
                lts = lido.toCharArray();
                saida = corrigir(lts, lido);
                for(int ind = saida.size() - 1; ind >= 0; ind--) {
                    sop(saida.get(ind));
                }
            }
            else {
                //sop("");
            }
            lido = ler();
        }
    }

}
