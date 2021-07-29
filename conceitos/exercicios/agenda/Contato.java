public class Contato {
    
    String nome;
    String numero; // 99999-9999 / (91) 99999-9999 / 99999999
    String tipo;

    public Contato() {
        this.nome = "";
        this.numero = "";
    }

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public Contato(String nome, String numero, String tipo) {
        this.nome = nome;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.numero;
    }
}
