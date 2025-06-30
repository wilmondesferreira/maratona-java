package academy.devdojo.maratonajava.introducao;

public class Aula05_EstuturasCondicional03 {
    public static void main(String[] args) {

        //Operador ternario (expressão booleana) ? código 1 : código 2;
        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Ainda nao tenho condicoes de doar!";
        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

        //exemplo de simplificacao do codigo acima
        String resultado02 = salario > 5000 ? "Eu vou doar 500 para o DevDojo" : "Ainda nao tenho condicoes de doar!";
        System.out.println(resultado02);

    }
}
