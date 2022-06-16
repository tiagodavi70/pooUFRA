import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.HashMap;

public class EstruturaDados {
    
    public static void main(String args[]) {
        
        ArrayList listaSemTipo = new ArrayList();
        ArrayList<Integer> lista = new ArrayList<Integer>();

        lista.add(4);
        lista.add(4);
        lista.add(1, 5);
        int elemento = lista.get(0); // vetor[0]

        System.out.println(elemento);

        for (int i : lista) {
            System.out.println(i);
        }

        System.out.println(lista.indexOf(4));
        System.out.println(lista.contains(4));
        System.out.println(lista.size());
        System.out.println(lista);
        System.out.println(lista.toArray()[0]);
        System.out.println(lista.remove(0)); // index ou objeto


        HashSet setSemTipo = new HashSet();
        HashSet set = new HashSet<Integer>();

        Stack pilhaSemTipo = new Stack();
        Stack pilha = new Stack<Integer>();

        HashMap map = new HashMap<String, Integer>();
        map.put("chave0", 0);
        map.put("chave1", 1);
        System.out.println(map.get("chave0")); 
        System.out.println(map.keySet());   
        System.out.println(map.values());   
        System.out.println(map.entrySet()); 
        System.out.println(map.size());    
    }
}
