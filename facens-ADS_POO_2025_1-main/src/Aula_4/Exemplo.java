package Aula_4;


import javax.swing.JOptionPane;

public class Exemplo {

    public static void main(String[] args) {
        JOptionPane.showInputDialog("Digite seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
        
    }
    
}