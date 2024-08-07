import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class    Main {
    public static  void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        Carro carro1 = new Carro();

        System.out.println("Informe o modelo do carro: ");
        carro1.modelo = sc.next();

        System.out.println("Informe o ano do carro: ");
        carro1.ano = sc.nextInt();

        System.out.println("Informe a marca do carro: ");
        carro1.marca = sc.next();

        System.out.println("Informe a cor do carro: ");
        carro1.cor = sc.next();

        System.out.println("Modelo:" + carro1.modelo + " Ano:" + carro1.ano + " Marca:" + carro1.marca + " Cor:" + carro1.cor);

        String isentoIPVA = carro1.ehIsentoIPVA(2024) ? "é isento" : "não é isento";
        System.out.println("O carro1 " + isentoIPVA + " do Ipva");

        Loja loja = new Loja();
        Cidade cidade = new Cidade();
        cidade.cidade = "Campo Mourão";
        cidade.estado = Estado.PR;
        loja.nome = "Auto Imports";
        loja.cidade = cidade;


        List<Carro> carros = new ArrayList<>();
        carros.add(carro1);

        loja.estoque = carros;

    }
}
