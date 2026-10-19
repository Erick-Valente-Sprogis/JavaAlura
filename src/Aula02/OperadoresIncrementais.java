package Aula02;

public class OperadoresIncrementais {
    public static void main(String[] args) {
        //O operador de pré-incremento (++variavel) aumenta o valor da variável em 1 antes de usar a variável em uma expressão.
        // Aqui está um exemplo:
        int num = 5;
        int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6

        //Já o operador de pós-incremento (variavel++) aumenta o valor da variável em 1 depois de usar a variável em uma expressão.
        // Aqui está um exemplo:
        int numero= 5;
        int resultado2 = numero++; //numero é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(numero); // imprime 6
        System.out.println(resultado2); // imprime 5

    }
}
