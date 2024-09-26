import java.util.Scanner;

public class Calculator2{
    public static void main(String[] args){
        int contador = 0;
        while(contador < 50){
            System.out.println("Qual operacao: \n + - Adicao \n - - Subtracao \n * - Multiplicacao \n / - Divisao");
            Scanner scn = new Scanner(System.in);
            int opcao = scn.nextInt();
            System.out.println("Digite o primeiro valor: ");
            Double first = scn.nextDouble();
            System.out.println("Digite o segundo valor");
            Double second = scn.nextDouble();
            Double resultado = 0.0;
            if(opcao == 1){
                resultado = first + second;   
            }
            if(opcao == 2){
                resultado = first - second;
            }
            if(opcao == 3){
                resultado = first * second;
            }
            if(opcao == 4){
                resultado = first / second;
            }
            System.out.println("= " + resultado);
        }
    }
}
