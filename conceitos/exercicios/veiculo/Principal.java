public class Principal {
    // Dado a classe abaixo:

    // class Veiculo {

    //     String nome;
    //     double kilometragem;
    //     double velocidadeMaxima;
        
    //     Veiculo(String nome, double km, double velocidadeMaxima){
    //         this.nome = nome;
    //         this.kilometragem = km;
    //         this.velocidadeMaxima = velocidadeMaxima;
    //     }
    // }

    // Crie uma classe Onibus que herda os atributos de Veiculo. A classe onibus deve ter um atributo de tarifa,
    // assim como um get e set para esse atributo.
    // Use polimorfismo para criar a função toString() do Onibus que descreve suas informações.
    public static void main(String[] args) {
        
        Onibus onibus = new Onibus("Guamá Pres. Vargas", 200, 150, 3.6);
        System.out.println(onibus);
    }
}
