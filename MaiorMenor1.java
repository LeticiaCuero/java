import java.util.Scanner;

public class MaiorMenor {
    public static void main (String[] args){
        Double primeiro = 0.0;
        Double segundo = 0.0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        primeiro = scn.nextDouble();
        System.out.println("Digite o segundo valor: ");
        segundo = scn.nextDouble();
        if (primeiro > segundo){
            System.out.println(primeiro + " maior que " + segundo);
        }
        if (segundo > primeiro) {
            System.out.println(segundo + " maior que " + primeiro);
        }
    }
}
