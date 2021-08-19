package questao3;

public class Tigre extends Felino {
    
    Tigre(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public String verificaDomestico() {
        return "não domestico";
    }
}
