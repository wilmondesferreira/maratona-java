package academy.devdojo.maratonajava.introducao;

public class Aula04_Operadores {
    public static void main(String[] args) {
        // Operadores basicos: + - / *

        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // Operador % (resto)

        int resto = 21 % 7;
        System.out.println(resto);

        // Operadores logicos < > / <= / >= / == / !=
        // sempre retornam valores booleanos

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte "+ isDezMaiorQueVinte);
        System.out.println("isDezMaiorQueVinte "+ isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte "+ isDezIgualVinte);
        System.out.println("isDezIgualDez "+ isDezIgualDez);
        System.out.println("isDezDiferenteDez "+ isDezDiferenteDez);


    }
}
