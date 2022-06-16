import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        int opcao = 1;
        Scanner entrada = new Scanner(System.in);
        
        Produto[] produto = new Produto[10];
        Venda[] venda = new Venda[200];

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
                    String nome = entrada.next();
                    System.out.println("Entre com o preço do produto");
                    float preco = entrada.nextFloat();
                    System.out.println("Entre com o tipo do produto");
                    String tipo = entrada.next();
                    produto[indice] = new Produto(nome, preco, tipo);

                    System.out.println(produto[indice]);
                    indice++;
                    break;
                }
                case 2: {
                    // TODO: verificar se o número digitado está listado
                    System.out.println("Entre com o número do produto que você gostaria de vender");
                    System.out.println(mostrarTodos(indice, produto));
                    int i_venda = entrada.nextInt();
                    venda[indiceVendas] = new Venda(produto[i_venda]);
                    // TODO: aviso de venda realizada com sucesso
                    indiceVendas++;
                    break;
                }
                case 3: {
                    float ganhoTotal = 0;
                    float[] somaProduto = new float[10];
                    for (int i = 0; i < indiceVendas ; i++) {
                        ganhoTotal += venda[i].getProduto().getPreco();
                        
                        // TODO: fazer a soma dos ganhos pro produto
                    }
                    System.out.println("Ganho Total: " + ganhoTotal);
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

    public static String mostrarTodos(int maximo, Produto[] produto) {
        String saida = "";
        for (int i = 0 ; i < maximo ; i++) {
            saida += i + " - " + produto[i];
        }
        return saida;
    }
}
