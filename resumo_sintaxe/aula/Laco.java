public class Laco {

    public static void main(String[] args) {
        
		int[] numeros = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Laco for");
		for (int i = 0; i < numeros.length ; i++){
			System.out.println("Item: " + numeros[i]);
		}
		
		System.out.println("Laco for melhorado");
		for (int item : numeros) {
			System.out.println("Item: " + item);
		}
		
		System.out.println("Laco while");
		int j = 0;
		while (j < 10){
			System.out.println("Numero: " + j);
			j++;
		}
		
		System.out.println("Laco do-while");
		j = 0;
		do {			
			System.out.println("Numero: " + j);
			j++;
		} while (j < 10);
    }
}
