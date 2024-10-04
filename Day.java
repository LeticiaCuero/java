import java.util.Scanner;

public class Day{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String contador = "sim";
        while(!contador.equals("nao")){
            System.out.println("Informe a hora: ");
            int time = scn.nextInt();
            if(time >= 5 && time < 12){
                System.out.println(time + " da manha");
            }
            else if(time >= 13 && time <= 18){
                System.out.println(time + " da tarde");
            }
            else if(time > 18 && time <= 24){
                System.out.println(time + " da noite");
            }
            else{
                System.out.println(time + " da madrugada");
            }
        }
        scn.close();
    }
}
