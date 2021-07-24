import java.util.Scanner;


public class Questao13 {

    public static void main(String[] args){
        int menor = 99999999;
        int maior = -1;
        int num = -1;
        Scanner in = new Scanner(System.in); 

        while (num != 0) {
            num = in.nextInt();
            System.out.println(num);
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println(maior);
    }
}