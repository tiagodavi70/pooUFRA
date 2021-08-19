package questao3;

public class Leao extends Felino {
    
    Leao(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public String verificaDomestico() {
        return "não domestico";
    }
}
