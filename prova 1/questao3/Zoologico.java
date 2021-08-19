package questao3;

public class Zoologico {

    // Implemente a classe Felino, e as subclasses Gato, Tigre e Leão. 
    // A classe Felino deve ter os atributos nome e peso, e um método que retorna se é doméstico ou não. 
    // Defina como deve ser o construtor de cada subclasse. Todos os atributos devem ter get e set.
    // Os construtores devem inicializar todos os atributos. Defina também usando polimorfismo se o Felino é ou não doméstico.
    // Crie uma classe Zoologico para testar as classes criadas.
    
    public static void main(String[] args) {
        
        Gato gato = new Gato("Tiago", 2);
        Tigre tigre = new Tigre("Alexandre", 150);
        Leao leao = new Leao("Pedro", 150);

        System.out.println(
            gato.getNome() + " " + gato.verificaDomestico() + "\n" +
            tigre.getNome() + " " + tigre.verificaDomestico() + "\n" +
            leao.getNome() + " " + leao.verificaDomestico() + "\n"
        );
    }
}
