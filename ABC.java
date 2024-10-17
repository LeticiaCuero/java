import java.util.Scanner;

public class ABC {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String frase = "";
        int contC = 0;
        int contV = 0;
        char c = ' ';

        System.out.println("Digite a frase para contagem: ");
        frase = scn.nextLine();
        frase = frase.toLowerCase();

        for(int cont = 0; cont < frase.length(); cont++){

            c = frase.charAt(cont);

            if (c >= 'a' && c <= 'z'){

                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    contV++;
                }else{
                    contC++;
                }
            } 
        }
        System.out.println("Total consolantes: " + contC);
        System.out.println("Total Vogais " + contV);
    }
}
