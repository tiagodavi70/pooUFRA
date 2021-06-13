public class Decisao {

    public static void main(String[] args) {
        
		double valor = 21.75;
		String fidelidade = "Estudante";
		double desconto;
		double valorDesconto;
		
		if (valor > 20) {
			System.out.println("Voce vai ganhar pontos de fidelidade!");
		}
		
		switch (fidelidade) {
			case "Sem desconto":
				desconto = 0;
				break;
			case "Estudante":
				desconto = 0.25;
				break;
			default:
				desconto = 0.1;
				break;
		}
		valorDesconto = valor * desconto;
		if (desconto != 0) {
			System.out.println("Voce vai ter o desconto de: " + valorDesconto);
		} else {
			System.out.println("Valor final sem desconto: " + valor);
		}
    }
}
