package Aula02;

public class OperadoresLogicos {
    public static void main(String[] args) {

        //O operador AND (&&), que traduzindo para o português seria o E, é usado para verificar se duas condições são verdadeiras.
        // Se ambas as condições forem verdadeiras, o resultado será verdadeiro. Caso contrário, o resultado será falso.
        // Aqui está um exemplo:
        boolean a = true;
        boolean b = false;
        if (a && b) {
            // Este código não será executado, já que a é verdadeiro e b é falso.
        }

        //O operador OR (||), que traduzindo para o português seria o OU, é usado para verificar se pelo menos uma das condições
        // é verdadeira. Se pelo menos uma das condições for verdadeira, o resultado será verdadeiro. Caso contrário, o resultado
        // será falso. Aqui está um exemplo:
        boolean c = true;
        boolean d = false;
        if (c || d) {
            // Este código será executado, já que a é verdadeiro, mesmo que b seja falso.
        }

        //O operador NOT (!) é usado para negar uma condição. Se a condição for verdadeira, o resultado será falso.
        // Se a condição for falsa, o resultado será verdadeiro. Aqui está um exemplo:
        boolean e = true;
        if (!e) {
            // Este código não será executado, já que a é verdadeiro.
        }
    }
}
