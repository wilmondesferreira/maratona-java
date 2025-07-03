package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        //arrays em Java sempre são objeto
        //Ao criar um array com new int[3], por exemplo, são alocados três espaços de memória com valores padrão.
        //padroes de inicializacao para tipos primitivos
            //byte, short, int, long, float e double sao iniciados em 0
            //char '\u0000' = espaco vazio
            //boolean = falso
            //String = null


        String [] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Hinata";
        nomes[3] = "Hinata";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }

    }
}
