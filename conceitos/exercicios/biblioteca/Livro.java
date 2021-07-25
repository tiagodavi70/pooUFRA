public class Livro {
    
    String nome;
    boolean emprestado;

    public Livro(String nome) {
        this.nome = nome;
        this.emprestado = false;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean getEmprestimo() {
        return this.emprestado;
    }

    public void setEmprestimo() {
        this.emprestado = !this.emprestado;
    }
}
