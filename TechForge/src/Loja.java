import java.util.List;

public class Loja {
    public String nome;
    public Cidade cidade;
    public List<Carro> estoque;

    public Loja(String nome, Cidade cidade, List<Carro> estoque) {
        this.nome = nome;
        this.cidade = cidade;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public List<Carro> getEstoque() {
        return estoque;
    }
}




