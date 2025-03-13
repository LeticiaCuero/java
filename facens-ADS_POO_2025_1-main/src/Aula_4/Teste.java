/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula_4;

import javax.swing.JOptionPane;


public class Teste {

    public static void main(String[] args) {
        System.err.println("Sistema de vendas! ");
        String nome = JOptionPane.showInputDialog("Informe o nome do item: ");
        Double valor = Double.parseDouble(JOptionPane.showInputDialog(nome + "Informe o valor: "));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(nome + "Informe a quantidade: "));
        System.out.println("Cadastrado com sucesso!! \n Item: "+nome + "\nValor: " + valor + "\nQuantidade: " + quantidade);
    }
    
}
