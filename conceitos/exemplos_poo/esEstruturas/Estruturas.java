import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Estruturas {
    
    public static void main(String[] args) {
        // ArrayList lista = new ArrayList();
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Tiago"); // Adicionar na lista
        lista.add("Alexandre");
        lista.add("Marcio");

        System.out.println("Tamanho: " + lista.size()); // Tamanho
        System.out.println("Lista: " + lista); // Mostrar lista

        lista.remove(2); // Remover da lista usando o indíce
        lista.remove("Tiago"); // Remover da lista pelo elemento
        
        System.out.println(lista.get(0));        
        System.out.println("Lista: " + lista);

        Stack<String> pilha = new Stack<String>();
        pilha.push("Tiago"); // Adicionar na pilha
        pilha.push("Alexandre");
        pilha.push("Marcio");
        System.out.println("Pilha: " + pilha);

        String nome = pilha.pop(); // Remover da pilha
        System.out.println("Pilha: " + pilha);
        System.out.println("Retirado: " + nome);

        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        hashmap.put("Tiago", 10); // Adicionar no hashmap
        hashmap.put("Alexandre", 20);
        hashmap.put("Marcio", 30);

        System.out.println("Tiago: " + hashmap.get("Tiago"));
        System.out.println("HashMap: " + hashmap.entrySet());

    }
}