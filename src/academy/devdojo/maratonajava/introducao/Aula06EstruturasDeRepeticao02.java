package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprimir todos os numeros pares de 0 ate 1milhao

        for (int i = 1; i <= 1000000 ; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }


    }
}
