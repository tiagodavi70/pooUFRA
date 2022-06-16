import java.util.Date;


public class Venda {
    
    Produto produto;
    Date data;

    public Venda(Produto produto) {
        this.produto = produto;
        this.data = new Date();
    }

    public Produto getProduto() {
        return this.produto;
    }

    @Override
    public String toString() {
        return "Venda: " + produto + " | " + data; 
    }
}
