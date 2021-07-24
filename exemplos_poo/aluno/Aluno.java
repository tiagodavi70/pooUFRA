package aluno;

public class Aluno {
    private String nome;
    private int matricula;
    static private int contador_alunos;

    public Aluno(String nome) {
        this.nome = nome;
        this.matricula = gerarMatricula();
    }

    public String getNome() {
        return this.nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    static private int gerarMatricula() {
        contador_alunos = contador_alunos + 1;
        return contador_alunos;
    }

    public void imprimirPerfil() {
        System.out.println("Nome do Aluno1: " + this.getNome() + "\n" + 
                            "Matricula: " + this.getMatricula());
    }
}
