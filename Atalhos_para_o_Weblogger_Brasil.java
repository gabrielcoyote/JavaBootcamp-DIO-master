package Busca_e_Substituição_em_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

// Você está ajudando a desenvolver um sistema de gerenciamento de weblog chamado Weblogger Brasil. Embora
// Weblogger Brasil coloque todo o conteúdo direto no website em HTML, nem todos autores apreciam usar
// tags HTML em seus textos. Para tornar a vida deles mais fáceis, Weblogger Brasil oferece uma sintaxe
// simples chamada atalhos para obter alguns efeitos textuais em HTML. Sua tarefa é, dado um documento
// escrito com atalhos, traduzi-lo para o HTML apropriado.
// Um atalho é usado para colocar texto em itálico. HTML faz isto com as tags <i> e </i>, mas no Weblogger Brasil
// um autor pode simplesmente colocar um pedaço de texto entre dois caracteres de sublinhado, '_'. Portanto,
// onde um autor escreve.

// Entrada: A entrada contem vários casos de teste. Cada caso de teste é composto por uma linha que contem
// uma string texto, com zero ou mais usos dos atalhos itálico e negrito. Cada texto tem de 1 a 50 caracteres,
// inclusive. Os únicos caracteres permitidos no texto são os caracteres alfabéticos (de 'a' a 'z' e de 'A' a 'Z'),
// o sublinhado ('_'), o asterisco ('*'), o caractere de espaço e os símbolos de pontuação ',', ';', '.', '!', '?',
// '-', '(' e ')'. O caractere sublinhado '_' ocorre no texto um número par de vezes. O asterisco
// '*' também aparece um número par de vezes no texto. Nenhuma substring do texto entre um par de sublinhados
// ou entre um par de asteriscos pode conter outros sublinhados ou asteriscos, respectivamente.

// Saída: Para cada linha de entrada seu programa deve gerar uma linha de saída com o texto traduzido para HTML
// como demonstrado nos exemplos abaixo. Para tornar itálico um pedaço de texto no HTML, você deve iniciar este
// pedaço com a tag <i> e terminá-lo com a tag </i>. Para texto em negrito, inicie com <b> e termine com </b>.

public class Atalhos_para_o_Weblogger_Brasil {

    public static void main(String[] args) throws IOException {

        // O método setDefault (Locale) da classe Locale em Java é usado para definir o código do idioma
        // padrão para esta instância da JVM ou da máquina virtual. (Não afeta escrita do codigo)

        Locale.setDefault(new Locale("pt", "BR"));

        // entrada dos dados

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String textoHtml;

        // texto entra le a proxima linha e continua quando for diferente de null

        while ((textoHtml = br.readLine()) != null) {


            // chamada dos metodos declarados a baixo

            textoHtml = convertItalic(textoHtml);
            textoHtml = convertBold(textoHtml);

            System.out.println(textoHtml);
        }
    }

    //replaceFirst () substitui a primeira substring 'regex'encontrada que corresponde à substring de argumento
    // fornecida (ou expressão regular) com a substring de substituição fornecida.

    private static String convertItalic(String textoHtml) {

        boolean toggle = true;
        while (textoHtml.contains("_")) {

            if (toggle) {
                textoHtml = textoHtml.replaceFirst("_", "<i>");
            } else {
                textoHtml = textoHtml.replaceFirst("_", "</i>");
            }
            toggle = !toggle;

        }
        return textoHtml;
    }

    private static String convertBold(String textoHtml) {

        boolean toggle = true;
        for (int i = 0; i < textoHtml.length(); i++) {

            String tmp = textoHtml;
            if (textoHtml.charAt(i) == '*') {

                if (toggle) {
                    tmp = textoHtml.substring(0, textoHtml.indexOf("*")) +
                            "<b>" +
                            textoHtml.substring(textoHtml.indexOf("*")+1);
                } else {
                    tmp = textoHtml.substring(0, textoHtml.indexOf("*")) +
                            "</b>" +
                            textoHtml.substring(textoHtml.indexOf("*")+1);
                }
                textoHtml = tmp;
                toggle = !toggle;
            }
        }

        return textoHtml;
    }
}
