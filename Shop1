import java.util.Scanner;

public class Shop {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Double novoValor = 0.0;
        int contador = 0;
        while(contador < 50){
            System.out.println("Informe o nome do produto");
            String name = scn.next();
            System.out.println("Informe a marca do produto");
            String marca = scn.next();
            System.out.println("Informe o valor do produto");
            Double valor = scn.nextDouble();
            Double desconto = 0.0;
            desconto = valor * 0.10;
            novoValor = valor - desconto;
            System.out.println("Produto: " + name + "\n Marca: " + marca + "\n Valor original: " + valor + "\n Valor com desconto: " + novoValor);
        }
    }
}
