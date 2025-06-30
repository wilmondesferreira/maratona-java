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

        // Operadores relacionais < > / <= / >= / == / !=
        // sempre retornam valores booleanos

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMaiorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        //Operadores Logicos && (AND) / || (OR) / ! (NOT)


        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        //Operadores de atribuicao = / += / -= / *= / /= / %=

        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2;  // 3600
        bonus /= 2;  //1800
        bonus %= 2;  // resto da div = 0
        System.out.println(bonus);

        // contadores
        int contador = 0;
        contador += 1; //contador = contador + 1
        contador++;    //primeiro executa o que tem para depois encrementar o valor
        contador--;
        ++contador;  //primeiro encrementa depois executa
        --contador;
        System.out.println(contador);

    }


}

