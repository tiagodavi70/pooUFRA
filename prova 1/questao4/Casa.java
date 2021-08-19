package questao4;

public class Casa {
    
    // Crie três classes: Quarto, Cozinha, Banheiro. Crie três atributos para cada uma delas, 
    // com seus respectivos get e set. Crie também um construtor que inicialize os objetos 
    // utilizando os atributos criados. Crie também um método para cada classe, que retorna as
    // informações de cada atributo. Crie uma classe Casa que teste esses cômodos, 
    // criando eles e usando a função para imprimir os atributos.

    public static void main(String[] args) {
        
        Cozinha cozinha = new Cozinha("frigobar", 1, 1);
        Quarto quarto = new Quarto(2, 4, false);
        Banheiro banheiro = new Banheiro("normal", 2, "boa qualidade");

        System.out.println(cozinha);
        System.out.println(quarto);
        System.out.println(banheiro);
    }
}
