package Busca_e_Substituição_em_Java;

import java.util.Scanner;

// Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver o novo sistema de cadastro, e
// pediram a sua ajuda. Sua task é fazer o código que valide as senhas que são cadastradas, para isso você
// deve atentar aos requisitos a seguir:

//A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e um número;
//A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
//Além disso, a senha pode ter de 6 a 32 caracteres.

// Entrada: A entrada contém vários casos de teste e termina com final de arquivo. Cada linha tem uma string S,
// correspondente a senha que é inserida pelo usuário no momento do cadastro.

// Saida: A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha cada item dos requisitos
// solicitados anteriormente, ou “Senha invalida.”, se um ou mais requisitos não forem atendidos.

public class Validador_de_senhas_com_requisitos {

    public static void main(String[] args) {

        // entrada de dados

        Scanner scanner = new Scanner(System.in);
        String senha;
        boolean senhaStatus = false;
        final String SENHA_VALIDA = "Senha valida.";
        final String SENHA_INVALIDA = "Senha invalida.";

        while (scanner.hasNextLine()) {
            senha = scanner.nextLine();

            senhaStatus = checkPassword(senha);

            if(senhaStatus){
                System.out.println(SENHA_VALIDA);
            }else{
                System.out.println(SENHA_INVALIDA);
            }

        }

        scanner.close();
    }

    // metodo que valida a senha

    static boolean checkPassword(String password) {

    // entre 6 e 32 caracteres

        if (password.length() < 6 || password.length() > 32) {
            return false;
        }

        char[] passChars = password.toCharArray();

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasNumber = false;

    // isUpperCase Este método determina se o valor de char especificado é maiúsculo.
    // isLowerCase O método determina se o valor de char especificado está em minúsculas.
    // O método isdigit () retorna True se todos os caracteres em uma string forem dígitos.
        // Caso contrário, retorna False.

        for (char c : passChars) {
            //System.out.println(c);
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else {
                return false;
            }
        }



        if (hasLower && hasUpper && hasNumber) {
            return true;
        }

        return false;
    }
}
