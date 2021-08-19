package questao3;

public class Gato extends Felino {
    
    Gato(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public String verificaDomestico() {
        return "domestico";
    }
}
