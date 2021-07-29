public class Agenda {
    
    private Contato[] contatos;
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

    public void adicionarContatos(Contato[] contatos) {
        for (int i = 0 ; i < contatos.length ; i++) {
            this.contatos[this.numero_contatos + i] = contatos[i];
        }
        this.numero_contatos = this.numero_contatos + contatos.length;  
    }

    public void imprimirContatos() {
        for (int i = 0 ; i < this.numero_contatos ; i++) {
            System.out.println(contatos[i].getNome());
        }
    }

    @Override
    public String toString(){
        String str = "";
        for (int i = 0 ; i < this.numero_contatos ; i++) {
            str = str + this.contatos[i] + "\n"; 
        }
        return str;
    }
}
