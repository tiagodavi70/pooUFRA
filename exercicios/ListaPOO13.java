import java.util.Scanner;

public class ListaPOO13 {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
      int nMenor = Integer.MAX_VALUE;
      int nMaior = 0; 
      int numero = 0;
      
      String continuar = "s";
      while(continuar.equals("s")){
          System.out.printf("Digite um número: ");
          numero = ler.nextInt();
          if(numero > nMaior){
            nMaior = numero;
          }
          
          if(numero < nMenor){
            nMenor = numero;
          }
          
          System.out.printf("Deseja continuar? [ s/n ]:  ");
          continuar = ler.next();
          
        //   if("n".equals(continuar)){
        //       break;
        //   }
          
        //   i += 1;
      }
      
      System.out.println("o maior valor digitado foi: " + nMaior + ", e o menor valor digitado foi: " + nMenor);
    }
}