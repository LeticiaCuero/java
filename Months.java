import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int day = 0;
        String contador = "sim";

        while (!contador.equals("nao")) {

            System.out.println("Escolha uma opção:");
            System.out.println("1: Dia entre 1 a 15");
            System.out.println("2: Dia entre 16 a 30");
            System.out.println("3: Insira o dia");
            int option = scn.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Primeira quinzena");
                    break;
                case 2:
                    System.out.println("Segunda quinzena");
                    break;
                case 3:
                    System.out.println("Digite o dia: ");
                    day = scn.nextInt();
                    if (day >= 1 && day <= 15) {
                        System.out.println("Primeira quinzena");
                    } 
                    else if (day >= 16 && day <= 30) {
                        System.out.println("Segunda quinzena");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            System.out.println("Deseja continuar? (sim/nao):");
            contador = scn.next();
        }
    }
}
