package academy.devdojo.maratonajava.introducao;

public class Aula05_EstuturasCondicional01 {
    public static void main(String[] args) {

        //IF sempre vai retornar valores booleanos (true/false)
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoolica");
        } else {
            System.out.println("Nao autorizado a comprar bebida alcoolica");
        }

        if (!isAutorizadoComprarBebida) {  //atribuicao de negacao (!) inverte ou seja se a variavel e falsa vira vdd e se for vdd vira falsa
            System.out.println("Nao autorizado a comprar bebida alcoolica");
        }






    }
}
