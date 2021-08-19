public class TesteAutomovel {
    
    // Crie um construtor que inicialize todos os atributos.
    // Complete a função consumirTanque, que deve subtrair o valor de litros do atributo litrosTanque.
    // Em uma classe de teste, crie dois automóveis, e utilize a função litrosUtilizados para descobrir
    // quantos litros são usados em uma viagem de 50 km de cada carro criado.
    public static void main(String[] args) {

        Automovel carro1 = new Automovel("Carro1", 60, 1);
        Automovel carro2 = new Automovel("Carro2", 70, 1.2);

        System.out.println(carro1.litrosUtilizados(50));
        System.out.println(carro2.litrosUtilizados(50));
    }
}
