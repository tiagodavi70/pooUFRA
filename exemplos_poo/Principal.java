import aluno.Aluno;
import aluno.AlunoPos;

public class Principal {
    
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Tiago");
        Aluno aluno2 = new Aluno("Alexandre");
        AlunoPos aluno3 = new AlunoPos("Raissa");

        aluno1.imprimirPerfil();
        aluno2.imprimirPerfil();
        aluno3.imprimirPerfil();
    }
}
