import java.util.Scanner;

public class Atividade2 {

    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int numero = sc.nextInt();

        boolean numeroPar = numero % 2 == 0;

        if(numeroPar){
            System.out.println("O numero" + numero + " é par.");
        } else {
            System.out.println("O numero" + numero + " é impar.");
        }
    }
}
