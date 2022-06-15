import java.util.ArrayList;
import java.util.Scanner;


// Sistema de cobrança de energia elétrica

// Fatura 
// valor, consumo, titular, juros, imposto, taxa iluminacao 

// Fatura
// Cliente
// Bandeira
// Pessoa
// Funcionario
// Equipamento

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Fatura> faturas = new ArrayList<Fatura>();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Funcionario tiago = new Funcionario("Tiago", "000000", "Rua x", 3000, "eletricista");
        Funcionario juliana = new Funcionario("Juliana", "000001", "Rua y", 20000, "eletricista");

        Equipamento padrao = new Equipamento("Geracao1", 1000, "2022");

        Bandeira verde = new Bandeira("Verde", 1, 0.1, 0.03, 20);
        Bandeira vermelha = new Bandeira("Vermelha", 2, 0.2, 0.05, 30);

        int opcao = 1;
        while (opcao != 0) {
            System.out.println("Entre com a opcao desejada: ");
            System.out.println("1 - Cadastro de Fatura");
            System.out.println("2 - Atualizar Fatura");
            System.out.println("3 - Remover Fatura");
            System.out.println("4 - Relatorio de Faturas");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            System.out.println(opcao);
            switch (opcao) {
                case 1:{
                    // Cadastro
                    if (clientes.size() == 0) {
                        System.out.println("Sem clientes cadastrados, cadastre agora.");
                        Cliente cliente = cadastroCliente();
                        clientes.add(cliente);
                    } else {
                        System.out.println("Deseja cadastrar outro cliente\n1 - sim\n2 - nao");
                        int escolhaCliente = scanner.nextInt();
                        if (escolhaCliente == 1) {
                            clientes.add(cadastroCliente());
                        }
                    }
                    System.out.println("Selecione o número do cliente para criar a fatura.");
                    // listarClientes(clientes);
                    listar(clientes);
                    int numCliente = scanner.nextInt() - 1;

                    System.out.println("Preencha os dados da Fatura:");
                    System.out.print("Bandeira:\n1 - Verde\n2 - Vermelha");
                    int numBandeira = scanner.nextInt() - 1;
                    Bandeira bandeira;
                    if (numBandeira == 1) {
                        bandeira = verde;
                    } else {
                        bandeira = vermelha;
                    }
                    // alternativo ao if: bandeira =  numBandeira == 1 ? verde : vermelha

                    System.out.println("Funcionario:\n1 - Tiago\n2 - Juliana");
                    int numFunc = scanner.nextInt() - 1;
                    Funcionario funcionario;
                    if (numFunc == 1) {
                        funcionario = tiago;
                    } else {
                        funcionario = juliana;
                    }

                    Fatura fatura = cadastroFatura(clientes.get(numCliente), bandeira, funcionario, padrao);
                    faturas.add(fatura);
                    break;
                }
                case 2:{
                    // Atualizacao
                    System.out.println("Selecione o número da fatura para alteração.");
                    listar(faturas);
                    int numFat = scanner.nextInt() - 1;


                    System.out.println("Preencha os dados da Fatura:");
                    System.out.print("Bandeira: 1 - Verde\n2 - Vermelha");
                    int numBandeira = scanner.nextInt() - 1;
                    Bandeira bandeira;
                    if (numBandeira == 1) {
                        bandeira = verde;
                    } else {
                        bandeira = vermelha;
                    }
                    // alternativo ao if: bandeira =  numBandeira == 1 ? verde : vermelha

                    System.out.print("Funcionario: 1 - Tiago\n2 - Juliana");
                    int numFunc = scanner.nextInt() - 1;
                    Funcionario funcionario;
                    if (numFunc == 1) {
                        funcionario = tiago;
                    } else {
                        funcionario = juliana;
                    }

                    Fatura fatura = cadastroFatura(faturas.get(numFat).getTitular(), bandeira, funcionario, padrao);
                    faturas.set(numFat, fatura);
                    break;
                }
                case 3:{
                    // remocao
                    System.out.println("Selecione o número da fatura para alteração.");
                    listar(faturas);
                    int numFat = scanner.nextInt() - 1;

                    faturas.remove(numFat);
                    break;
                }
                case 4:{
                    // relatorio
                    double valorTotal = 0, consumoTotal = 0;

                    for (Fatura f : faturas) {
                        valorTotal += f.valor();
                        consumoTotal += f.getConsumo();
                    }

                    System.out.println("Numero de faturas: " + faturas.size());
                    System.out.println("Valor total e valor medio: " + valorTotal + " | " + (valorTotal / faturas.size()));
                    System.out.println("Consumo total e consumo medio: " + consumoTotal + " | " + (consumoTotal / faturas.size()));
                    break;
                }
                case 0:{
                    // somente saida, sem código
                    break;
                }
                default: {
                    System.out.println("Opcao não cadastrada");
                    break;
                }
            }
        }
        scanner.close();
    }

    public static Cliente cadastroCliente() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("CPF: ");
        String cpf = scanner.next();
        System.out.print("Endereco: ");
        String endereco = scanner.next();
        System.out.print("Renda: ");
        double renda = scanner.nextDouble();
        // scanner.close();
        return new Cliente(nome, cpf, endereco, renda);
    }

    public static Fatura cadastroFatura(Cliente cliente, Bandeira bandeira, Funcionario funcionario, Equipamento equipamento) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mes: ");
        String mes = scanner.next();
        System.out.print("Endereco: ");
        String endereco = scanner.next();
        System.out.print("Consumo: ");
        double consumo = scanner.nextDouble();
        // scanner.close();
        return new Fatura(cliente, bandeira, funcionario, equipamento, endereco, mes, consumo);
    }

    // public static void listarClientes(ArrayList<Cliente> lista) {
    //     for (int i = 0 ; i < lista.size() ; i++) {
    //         System.out.println((i+1) + " - " + lista.get(i));
    //     }
    // }

    public static void listar(ArrayList lista) {
        for (int i = 0 ; i < lista.size() ; i++) {
            System.out.println((i+1) + " - " + lista.get(i));
        }
    }
}