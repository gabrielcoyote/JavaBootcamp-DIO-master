package Fundamentos_Aritméticos_em_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

// Você deve calcular o consumo médio de um automóvel onde será informada a distância total percorrida (em Km)
// e o total de combustível consumido (em litros).
// Entrada: Você receberá dois valores: um valor inteiro X com a distância total percorrida (em Km), e um valor
// real Y que representa o total de combustível consumido, com um dígito após o ponto decimal.
// Saida: Exiba o valor que representa o consumo médio do automóvel (3 casas após a vírgula),
// incluindo no final a mensagem "km/l".

public class Consumo {

    public static void main(String[] args) throws IOException {

        //Entrada de dados

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // define quantas casas  decimais depois da virgula

        DecimalFormat df = new DecimalFormat("0.00");
        df.setMaximumFractionDigits(3);

        // variaveis que recebe os valores

        int distancia;
        double volume;
        double consumo;

        // digita a distancia

        st = new StringTokenizer(br.readLine());
        distancia = Integer.parseInt(st.nextToken());

        // digita o volume

        st = new StringTokenizer(br.readLine());
        volume  = Double.parseDouble(st.nextToken());

        // consumo  recebe resultado dos dois

        consumo = distancia/volume;

        //imprimido o resultado passando a formatação

        System.out.println(df.format(consumo) + " km/l");

    }

}


