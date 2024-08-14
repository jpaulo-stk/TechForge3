import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static  void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro(2019,"Fusion", "azul", "Ford");



        System.out.println(carro.getAno());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.getMarca());
        System.out.println(carro.getIsentoIPVA());

    }
}
