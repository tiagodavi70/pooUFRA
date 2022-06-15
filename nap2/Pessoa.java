public class Pessoa {
    
    String nome;
    String cpf;
    String endereco;

    Pessoa(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return this.cpf;
    }

    // public void setCPF(String cpf) {
    //     this.cpf = cpf;
    // }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return this.nome + " | " + this.cpf;
    }
}
