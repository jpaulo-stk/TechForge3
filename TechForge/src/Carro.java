import java.time.LocalDate;

public class Carro {
   private String modelo;
   private String marca;
   private String cor;
   private Integer ano;
   private Boolean isentoIPVA;

   public Carro(Integer ano, String modelo, String cor, String marca) {
      System.out.println("Instância da classe carro: ");
      this.ano = ano;
      this.modelo = modelo;
      this.cor = cor;
      this.marca = marca;
      this.isentoIPVA = ehIsentoIPVA();
   }

   public boolean ehIsentoIPVA() {
      Integer anoAtual = LocalDate.now().getYear();
      int idadeCarro = anoAtual - this.ano;
      return idadeCarro >= 20;
   }

   public Integer getAno() {
      return this.ano;
   }

   public String getModelo() {
      return this.modelo.toUpperCase();
   }

   public Boolean getIsentoIPVA() {
      return this.isentoIPVA;
   }

   public String getCor() {
      return this.cor;
   }

   public String getMarca() {
      return this.marca;
   }
}
