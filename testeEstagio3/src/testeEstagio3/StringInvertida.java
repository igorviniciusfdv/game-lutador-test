package testeEstagio3;

import java.util.Scanner;

public class StringInvertida {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite uma palavra
        System.out.print("Digite uma palavra para inverter: ");
        String texto = scanner.nextLine();

        // Iniciei uma string vazia para armazenar a string invertida
        String textoInvertido = "";

        // Percorre a string original da última posição até a primeira
        for (int i = texto.length() - 1; i >= 0; i--) {
            // Concatenando cada caractere na string invertida
            textoInvertido += texto.charAt(i);
        }

        // Exibe a string invertida
        System.out.println("A palavra invertida é: " + textoInvertido);

        scanner.close();
    }
}
