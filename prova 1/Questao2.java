import java.util.Scanner;

public class Questao2 {
    
    // Uma turma tem 15 alunos e todos fizeram uma prova com 
    // 10 questões múltipla escolha (a, b, c ou d). 
    // Crie uma matriz para armazenar a resposta de todos os alunos.
    // Leia também um vetor de 10 posições contendo o gabarito de respostas.
    // Seu algoritmo deverá comparar as respostas de cada aluno com o gabarito e
    // emitir um vetor Resultado, contendo a nota de cada aluno.
    public static void main(String[] args) {
        int linhas = 15, colunas = 10;
        Scanner in = new Scanner(System.in);
        String[][] respostas = new String[linhas][colunas];
        String[] gabarito = new String[colunas];
        int[] resultado = new int[linhas];


        for (int i = 0 ; i < linhas  ; i++) {
            for (int j = 0 ; j < colunas  ; j++) {
                System.out.println("Digite a resposta " + i + " " + j + ": ");  
                respostas[i][j] = in.next();
            }
        }

        System.out.println("Gabarito: ");
        for (int i = 0 ; i < colunas  ; i++) {
            gabarito[i] = in.next();
        }

        for (int i = 0 ; i < linhas ; i++) {
            resultado[i] = 0;
            for (int j = 0 ; j < colunas ; j++) {
                if (respostas[i][j].equals(gabarito[j])) {
                    resultado[i] = resultado[i] + 1;
                }
            }
        }

        System.out.println("Notas: ");
        for (int i = 0 ; i < colunas ; i++) {
            System.out.println(resultado[i]);
        }
    }
}
