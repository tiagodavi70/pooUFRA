public class Colaborador {
    
    String nome;
    String sobrenome;
    double salario;

    Colaborador(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            this.salario = 0;
        } else {
            this.salario = salario;
        }
        // this.salario = salario < 0 ? 0 : this.salario;
    }
}
