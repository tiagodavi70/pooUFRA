public class Principal {
    // Faça um programa para controle de empréstimo de livros, com as classes Emprestimo, Livro e Pessoa.
    public static void main(String[] args) {
        
        Livro livro_poo = new Livro("POO");
        Pessoa tiago = new Pessoa("Tiago");

        Emprestimo emprestimo = new Emprestimo(livro_poo, tiago);

        emprestimo.imprimirEmprestimo();
    }
}