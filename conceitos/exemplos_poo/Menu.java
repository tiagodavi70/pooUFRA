import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        
        int opcao = 1;
        Scanner in = new Scanner(System.in);
        while (opcao > 0) {
            System.out.println("Opcoes: ");
            System.out.println("1 - Adicionar blablabla");
            System.out.println("2 - Editar blablabla");
            System.out.println("3 - Deletar blablabla");
            System.out.println("0 - Encerrar");
            System.out.print("Entre com a opcao: ");
            opcao = in.nextInt();

            switch (opcao) {
                case 1: {
                    funcao1();
                    break;
                }
                case 2: {
                    funcao2();
                    break;
                }
                case 3: {
                    // outra coisa
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Opcao Invalida");
                    break;
                }

            }
        }
    }

    public static void funcao1() {

    }
    
    public static void funcao2() {
        
    }
}