package academy.devdojo.maratonajava.introducao;

public class Aula05_EstuturasCondicional05 {
    public static void main(String[] args) {
        //Imprima o dia da semana, considerando o 1 como domingo
        //Switch aceita apenas os tipo (chat, int, byte, short, enum, String)
        byte dia = 10;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break; //sempre que satisfazer a condicao estipulada no case o break tem a funcao de parar a execucao
                        // do switch, sem o break e realiza a execucao.
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default: //o default e caso nenhuma condicao do case seja satisfeita essa sera o padrao para execucao.
                System.out.println("Dia digitado invalido");
        }

    }
}
