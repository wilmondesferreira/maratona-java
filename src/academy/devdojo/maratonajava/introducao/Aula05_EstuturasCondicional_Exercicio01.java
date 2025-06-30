package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05_EstuturasCondicional_Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o valor do seu salario anual: ");
        double salarioAnual = sc.nextDouble();
        double impostoSobreSalario = 0;
        double primeiraFaixaSalarial = 9.70 / 100;
        double segundaFaixaSalarial = 37.35 / 100;
        double terceiraFaixaSalarial = 49.50 / 100;

        if (salarioAnual <= 34712){
            impostoSobreSalario = salarioAnual * primeiraFaixaSalarial;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            impostoSobreSalario = salarioAnual * segundaFaixaSalarial;
        } else {
            impostoSobreSalario = salarioAnual * terceiraFaixaSalarial;
        }

        System.out.println(impostoSobreSalario);

        sc.close();

    }



}
