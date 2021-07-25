public class Emprestimo {
    
    Livro livro;
    Pessoa pessoa;

    public Emprestimo(Livro livro, Pessoa pessoa) {
        this.livro = livro;
        this.livro.setEmprestimo();
        this.pessoa = pessoa;
    }

    public void imprimirEmprestimo() {
        System.out.println(pessoa.getNome() + " emprestou " + livro.getNome());
    }
}
