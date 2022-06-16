// import java.util.Date;
import java.util.Scanner;


public class Imperativo {

    public static void main(String[] args) {
        
        int opcao = 1;
        Scanner entrada = new Scanner(System.in);
        String[] nome = new String[10];
        float[] preco = new float[10];
        String[] tipo = new String[10];
        
        int[] vendas = new int[200];
        int indiceVendas = 0;

        int indice = 0;

        while (opcao != 0) {
            System.out.println("Entre com a opção desejada: ");
            System.out.println("1 - Cadastrar novo produto");
            System.out.println("2 - Vender produto");
            System.out.println("3 - Gerar relatório");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();

            switch(opcao) {
                case 1: {
                    // TODO: verificar quando o indice for >= 10
                    System.out.println("Entre com o nome do produto");
                    nome[indice] = entrada.next();
                    System.out.println("Entre com o preço do produto");
                    preco[indice] = entrada.nextFloat();
                    System.out.println("Entre com o tipo do produto");
                    tipo[indice] = entrada.next();
                    indice++;
                    break;
                }
                case 2: {
                    // TODO: verificar se o número digitado está listado
                    System.out.println("Entre com o número do produto que você gostaria de vender");
                    System.out.println(mostrarTodos(indice, nome, preco, tipo));
                    vendas[indiceVendas] = entrada.nextInt();
                    // TODO: aviso de venda realizada com sucesso
                    indiceVendas++;
                    break;
                }
                case 3: {
                    float ganhoTotal = 0;
                    float[] somaProduto = new float[10];
                    for (int i = 0; i < indiceVendas ; i++) {
                        int indice_produto = vendas[i];
                        ganhoTotal += preco[indice_produto];

                        somaProduto[indice_produto] += preco[indice_produto];
                    }

                    System.out.println("Ganho Total: " + ganhoTotal);
                    System.out.println("Ganho por produto: ");
                    for (int i = 0; i < indice; i++) {
                        System.out.println("Total de " + nome[i] + ": " + somaProduto[i]);
                    }
                    break;
                }
                case 0: {
                    System.out.println("Saindo...");
                    break;
                }
                default: {
                    System.out.println("Opção Inválida.");
                    break;
                }
            }
        }
    }

    public static String mostrarProduto(String nome, float preco, String tipo) {
        return nome + " | " + preco + " | " + tipo;       
    }
    
    public static String mostrarTodos(int maximo, String[] n, float[] p, String[] t) {
        String saida = "";
        for (int i = 0 ; i < maximo ; i++) {
            saida += i + " - " + mostrarProduto(n[i], p[i], t[i]) + "\n"; 
        }
        return saida;
    }
}