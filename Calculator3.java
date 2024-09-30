import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        String contador = "sim";
        while (!contador.equals("nao")) {

            System.out.println("Digite o primeiro numero");
            double first = scn.nextDouble();

            System.out.println("Qual a operação? (+ - * /)");
            String text = scn.next();
            char operator = text.charAt(0);
            
            System.out.println("Digite o segndo numero");
            double second = scn.nextDouble();

            switch (operator) {
                case '+':
                    double resultado = first + second;
                    System.out.println(resultado);
                    break;

                case '-':
                    resultado = first - second;
                    System.out.println(resultado);
                    break;

                case '*':
                    resultado = first * second;
                    System.out.println(resultado);
                    break;

                case '/':
                    resultado = first / second;
                    System.out.println(resultado);
                    break;
                    
                default: System.out.println("Operador invalido");
                    break;
            }
        }
    }
}
