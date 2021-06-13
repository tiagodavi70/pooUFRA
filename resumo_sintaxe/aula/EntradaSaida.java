import java.util.Scanner; // Java tem um pacote voltado para leitura de dados
 
class EntradaSaida {
    public static void main(String args[])
    {
        // Usando Scanner para capturar uma entrada
        Scanner in = new Scanner(System.in); // Essa sintaxe de atribuição com new será apresentada depois
 
        String s = in.nextLine(); // Leitura de String
        System.out.println("Você entrou a String: " + s);
 
        int a = in.nextInt(); // Leitura de inteiro
        System.out.println("Você entrou o inteiro: " + a);
 
        float b = in.nextFloat(); // Leitura de real
        System.out.println("Você entrou o real: " + b);
       
		// fechando scanner
		in.close();
    }
}