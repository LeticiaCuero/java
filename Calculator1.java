import java.util.Scanner;

public class Calculator1{
    public static void main (String[] args){
        double primeiroValor = 0;
        double segundoValor = 0;
        int operacao = 0;
        double resultado = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        primeiroValor = scn.nextDouble();
        System.out.println("Selecione a operação: \n 1 - adição \n 2 - subtração \n 3 - multiplicação \n 4 - divisão");
        operacao = scn.nextInt();
        System.out.println("Digite o segundo valor: ");
        segundoValor = scn.nextDouble();
        if (operacao == 1 ){
            resultado = primeiroValor + segundoValor;
        }
        if (operacao == 2){
            resultado = primeiroValor - segundoValor;
        }
        if (operacao == 3){
            resultado = primeiroValor * segundoValor;

        }
        if (operacao == 4){
            resultado = primeiroValor / segundoValor;
        }
        System.out.println("resultado: " + resultado);
    }
}
