public class Principal {

    // Faça um programa de agenda telefônica, com as classes Agenda e Contato.
    public static void main(String[] args) {
        
        Contato c1 = new Contato("Tiago", "999999999");
        Contato c2 = new Contato("Alexandre", "999999999");
        Contato c3 = new Contato("Raissa", "999999999");
        Agenda agenda = new Agenda();

        // agenda.adicionarContato(c1);
        // agenda.adicionarContato(c2);
        // agenda.adicionarContato(c3);
        // agenda.imprimirContatos();

        Contato[] cs = {c1,c2,c3};
        agenda.adicionarContatos(cs);


        System.out.println(agenda);
        
    }
}