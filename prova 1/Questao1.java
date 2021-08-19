import java.util.Scanner;

public class Questao1 {

    // Uma empresa de entregas cobra 4 reais para cada quilômetro em uma entrega.
    // A cada 100 quilômetros é cobrada uma taxa extra de 10 reais.
    // Também são cobrados 2 reais por cada 30 quilos da entrega. 
    // Escreva um programa Java de simulação, que receba um número indefinido de entregas, e para cada entrega receba a 
    // quilometragem e o peso das encomendas. Ao final da execução deve apresentar o valor total a ser pago.
    
    public static void main(String args[]) {

        String continuar = "sim";
        Scanner in = new Scanner(System.in);
        double km = 0;
        double peso = 0;
        double totalPreco = 0;

        while (continuar.equals("sim")) {
            System.out.println("Indique a km: ");
            km = in.nextDouble();
            System.out.println("Indique o peso: ");
            peso = in.nextDouble();
            totalPreco = totalPreco + (4 * km + 10 * ((int) km / 100) + 2 * ((int) peso / 30));    
            System.out.println("Deseja continuar?");
            continuar = in.next();
        }
        in.close();
        System.out.println("Total: " + totalPreco);
    }
}