package Aula_4;

public class Apolice {
    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private Double valorAutomovel;
    
    public int getNumero (){
        return numero;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public char getSexo(){
        return sexo;
    }
    public double getValorAutomovel(){
        return valorAutomovel;
    }
    
    public void Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel){
        this.numero = numero;
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
                
    }
    public double calcularValor(char sexo, int idade, double valorAutomovel){
        
        if(sexo == 'M' && idade <= 25){
            return this.valorAutomovel = valorAutomovel * 10/100;
        } 
        else if(sexo == 'M' && idade > 25){
            return this.valorAutomovel * 5/100;  
        }
        else if (sexo == 'F'){
             return this.valorAutomovel * 2/100;   
        }
        else{
           return 0;     
        }
        
    }
    
}
