import java.util.Scanner;

public class Age1 {
    public static void main(String[] args){
        double idade = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite a idade com dois numeros: ");
        idade = scn.nextDouble();
        if (idade <= 11){
            System.out.println("Segundo o ECA " + idade + " anos e uma criança");
        }
        if (idade >= 12 && idade <= 18){
            System.out.println("Segundo o ECA " + idade + " anos e um adolescente");
        }
        if (idade >= 19 && idade <= 64){
            System.out.println("Segundo o ECA " + idade + " anos e um adulto");
        }
        if (idade >= 65){
            System.out.println("Segundo o ECA " + idade + " anos e um idoso");
        }
    }    
}
