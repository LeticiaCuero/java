import java.util.Scanner;

public class Numbers1{
    public static void main(String[] args){
        double valor = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        valor = scn.nextDouble();
        System.out.println();
        if (valor % 2 == 0){
            System.out.println("Numero par");
        }
        else{
            System.out.println("Numero impar");
        }
    }
}
