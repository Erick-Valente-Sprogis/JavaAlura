package Aula01;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Insira aqui dois números inteiros para a SOMA: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int resultado = n1 + n2;

        System.out.print("A soma dos números " + n1 + " e " + n2 + " é igual a: " + resultado);

    }
}
