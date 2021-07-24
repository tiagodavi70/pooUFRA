import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args){
        System.out.println("digte um numero: ");
        Scanner disputa;
        disputa = new Scanner(System.in);

        int dia = disputa.nextInt();
       
        if (dia == 1) {
            System.out.println("corresponde ao domingo!");
        }
        if (dia == 2){
            System.out.println("correspondeente a segunda-feira!");
        }
         if (dia == 3) {
            System.out.println("corresponde a terça-feira!");
        }
        if (dia == 4){
            System.out.println("correspondeente a quarta-feira!");
        }
          if (dia == 5) {
            System.out.println("corresponde a quinta feira!");
        }
        if (dia == 6){
            System.out.println("correspondeente a sexta-feira!");
        }
        if (dia == 7) {
            System.out.println("corresponde ao sabado!");
        }

        switch(dia){
            case 1:
                System.out.printf("Domingo");
                break;
            case 2:
                System.out.printf("Segunda-Feira");
                break;
            case 3:
                System.out.printf("Terça-Feira");
                break;
            case 4:
                System.out.printf("Quarta-Feira");
                break;
            case 5:
                System.out.printf("Quinta-Feira");
                break;
            case 6:
                System.out.printf("Sexta-Feira");
                break;
            case 7:
                System.out.printf("Sábado");
                break;
            default:
                System.out.printf("Dia não encontrado.");
                break;
        }
        
        disputa.close();
    }
}
