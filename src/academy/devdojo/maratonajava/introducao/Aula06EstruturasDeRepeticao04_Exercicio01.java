package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao04_Exercicio01 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas ele pode ser parcelado.
        //Condicao valorParcela = 1000;

        Scanner sc = new Scanner(System.in);
        //Entrada de valor do carro
        System.out.print("Informe o valor total do carro: ");
        double valorTotalCarro = sc.nextDouble();

        System.out.println("\nFormas de parcelamento com parcelas de no mínimo R$ 1.000:");

        //Loop para localizar todas as parcelas possiveis com o valor minimo de 1000.00
        for (int parcelas = 1; parcelas <= valorTotalCarro ; parcelas++) {
                double valorParcela = valorTotalCarro / parcelas;
            if (valorParcela < 1000) {
                break; //para a execucao do loop quando a condicao for satisfeita
            }
            System.out.printf("%d x de R$ %.2f\n", parcelas, valorParcela);
        }


        sc.close();




    }
}
