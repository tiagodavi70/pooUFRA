public class Cliente extends Pessoa {
    
    double renda;

    Cliente(String nome, String cpf, String endereco, double renda) {
        super(nome, cpf, endereco);
        this.renda = renda;
    }
    public double getRenda() {
        return this.renda;
    }
    public void setRenda(double renda) {
        this.renda = renda;
    }
}
