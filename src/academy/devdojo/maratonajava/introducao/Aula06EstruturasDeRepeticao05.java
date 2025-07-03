package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//Entrada de valor do carro
        System.out.print("Informe o valor total do carro: ");
        double valorTotalCarro = sc.nextDouble();

        System.out.println("\nFormas de parcelamento com parcelas de no mínimo R$ 1.000:");

        for (int parcelas = (int) valorTotalCarro; parcelas >= 1; parcelas--) {
            double valorParcela = valorTotalCarro / parcelas;
            if (valorParcela < 1000){
                continue; //continuar a execucao do loop ate que a condicao seja satisfeita
            }
            System.out.printf("%d x de R$ %.2f\n", parcelas, valorParcela);

        }
        sc.close();
    }
}
