package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05_EstuturasCondicional06_Exercicio02 {
    public static void main(String[] args) {
        //utilizando switch dados os valores de 1 a 7, imprima se e dia util ou final de semana
        //considerando 1 como domingo

        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o numero de 1 a 7 e saiba qual e o dia da semana: ");
        byte dia = sc.nextByte();

        switch (dia){

            case 1:
                System.out.println("Domingo = Final de semana");
                break;
            case 2:
                System.out.println("Segunda = Dia util");
                break;
            case 3:
                System.out.println("Terca = Dia util");
                break;
            case 4:
                System.out.println("Quarta = Dia util");
                break;
            case 5:
                System.out.println("Quinta = Dia Util");
                break;
            case 6:
                System.out.println("Sexta = Dia Util");
                break;
            case 7:
                System.out.println("Sabado = Dia Util");
                break;
            default:
                System.out.println("Numero digitado nao corresponde a um dia da semana");
                break;
        }
        sc.close();
    }
}
