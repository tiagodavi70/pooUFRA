public class Agenda {
    
    Contato[] contatos;
    private int numero_contatos;

    public Agenda() {
        this.contatos = new Contato[100];
        this.numero_contatos = 0;
    }

    public Agenda(Contato contato) {
        this.contatos = new Contato[100];
        this.contatos[0] = contato;
        this.numero_contatos = 1;
    }

    public void adicionarContato(Contato contato) {
        this.contatos[this.numero_contatos] = contato;
        this.numero_contatos++;
    }

    public void adicionarContatos(Contato[] contato) {

    }

    public void imprimirContatos() {
        for (int i = 0 ; i < this.numero_contatos ; i++) {
            System.out.println(contatos[i].getNome());
        }
    }
}
