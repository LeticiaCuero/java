import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Qual o valor do fatorial? ");
        int valor = scn.nextInt();
        int fatorial = valor - 1;

        for(int cont = valor; cont >= 1; cont--){
            fatorial = fatorial * cont;
            System.out.println(fatorial);
        }
        System.out.println(fatorial);
    }
}
