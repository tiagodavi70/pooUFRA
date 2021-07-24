
public class Vetores {
    
    public static void main(String[] args) {

        // int[] vetorInteiro;
        // vetorInteiro = new int[10];

        // int[] vetorInteiro = new int[10];

        // int[] vetorInteiro = { 1,2,3 };

        // vetorInteiro[0] = 2; // primeiro indíce 
        // vetorInteiro[9] = 7; // segundo indíce

        int[] vetorInteiro = new int[100];

        System.out.println("Tamanho do vetor: " + vetorInteiro.length);
        for (int i = 0; i < vetorInteiro.length ; i++) {
            vetorInteiro[i] = i+1;
        }

        String valoresVetor = "";
        for (int item : vetorInteiro) {
            valoresVetor = valoresVetor + item +  " ";
            // valoresVetor += valoresVetor +  " " + item;
            // System.out.println(item);
        }

        System.out.println(valoresVetor);
    }
}
