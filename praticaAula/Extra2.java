import java.util.Scanner;

// Escreva um programa em Java que crie uma lista com 10 nomes
// para guardar, junto com suas idades. 
// Não deve aceitar nenhuma pessoa menor de 18 anos.
// Os vetores devem ser preenchidos pelo usuário e ao final
// deve ser feita uma consulta com um novo nome para saber
// se ele está ou não cadastrado.
// A média de idades deve ser apresentada ao final.


public class Extra2 {
    
    public static void main(String[] args) {
        String nomes[] = new String[10];
        int idades[] = new int[10];
        Scanner entrada = new Scanner(System.in);

        int i = 0;
        while (i < 10) {
            System.out.print("Entre com o nome: ");
            String nome = entrada.next();
            System.out.print("Entre com a idade: ");
            int idade = entrada.nextInt();

            if (idade > 18) {
                nomes[i] = nome;
                idades[i] = idade;
                i++;
                System.out.println("Cadastrado com sucesso. Registro " + i);
            } else {
                System.out.println("Invalido pela idade");
            }
        }

        boolean continuar = true;
        while (continuar) {
            // busca
            System.out.print("Digite um nome para procurar: ");
            String temp = entrada.next();

            boolean encontrado = false;
            for (int j = 0; j < 10; j++) {
                if (temp.equals(nomes[j])) {
                    System.out.println("Encontrado na posicao " + j);
                    System.out.println(nomes[j] + " " + idades[j]);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("Nome não encontrado.");
            }

            // confirmação
            System.out.println("Deseja continuar?\n1 - sim\n2 - não");
            int cont = entrada.nextInt();
            continuar = cont == 1;
        }

        // media
        int soma = 0;
        float media = 0;
        for (int j = 0; j < 10; j++) {
            soma += idades[j];
        }
        media = soma/10f;
        System.out.println("Media de idade: " + media);
    }
}
