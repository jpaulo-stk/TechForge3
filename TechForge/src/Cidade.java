public class Cidade {
    public String cidade;
    public Estado estado;
    public String cep;
    public Integer populacao;

    public Cidade(String cidade, String cep, Integer populacao, Estado estado) {
        this.cidade = cidade;
        this.cep = cep;
        this.populacao = populacao;
        this.estado = estado;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getCep() {
        return this.cep;
    }

    public Integer getPopulacao() {
        return this.populacao;
    }

    public Estado getEstado() {
        return this.estado;
    }

}
