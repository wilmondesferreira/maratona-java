package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05_EstuturasCondicional02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //idade < 15                - categoria juvenil
        //idade >= 15 %% idade < 18 - categoria juvenil
        //idade >= 18               - categoria adulto

        System.out.printf("Informe sua idade: ");
        int idade = sc.nextInt();
        String categoria;

        if (idade < 15){
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categorial Juvenil";
        } else {
            categoria = "Categoria adulto";
        }

        System.out.println(categoria);


    }
}
