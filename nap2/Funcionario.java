public class Funcionario extends Pessoa {
    
    double salario;
    String cargo;

    Funcionario(String nome, String cpf, String endereco, double salario, String cargo) {
        super(nome, cpf, endereco);
        this.salario = salario;
        this.cargo = cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
