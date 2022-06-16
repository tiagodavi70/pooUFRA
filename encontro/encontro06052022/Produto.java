public class Produto {
    
    private String nome;
    private float preco;
    private String tipo;

    public Produto(String nome, float preco, String tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    // public void setNome(String nome) {
    //     this.nome = nome;
    // }

    public float getPreco() {
        return this.preco;
    }

    // public void setPreco(float preco) {
    //     this.preco = preco;
    // }

    public String getTipo() {
        return this.tipo;
    }

    // public void setTipo(String tipo) {
    //     this.tipo = tipo;
    // }

    @Override
    public String toString() {
        return nome + " | " + preco + " | " + tipo;
    }
}
