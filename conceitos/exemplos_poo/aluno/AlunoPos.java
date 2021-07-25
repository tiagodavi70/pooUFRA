package aluno;

public class AlunoPos extends Aluno {
    
    boolean qualificado;

    public AlunoPos(String nome) {
        super(nome);
        this.qualificado = false;
    }

    public boolean getQualificado() {
        return this.qualificado;
    }

    @Override
    public void imprimirPerfil() {
        System.out.println("Nome do Aluno1: " + this.getNome() + "\n" + 
                            "Matricula: " + this.getMatricula() + "\n" +
                            "Qualificado: " + this.getQualificado());
    }
}
