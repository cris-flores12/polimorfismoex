/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1polimorf;

/**
 *
 * @author crisf
 */
public class Animal {
    private String nome;
    private int idade;
    private double peso;
    
    public Animal(String nome,int idade,double peso){
       this.idade=idade;
       this.nome=nome;
       this.peso=peso;
    }
     public String getNome(){
       return nome;
    }
    public int getIdade(){
       return idade;
    }
     public void setNome(String nome){
            this. nome =nome;
            
        }
        public void setidade(int idade){
            this.idade=idade;
            
        }
     public void setpeso(double peso){
            this. peso=peso;
            
        }
        public double getpeso(){
            return peso;           
        }
        void emitirSom(){
            System.out.println("O animal faz barulho.");
        }
        
}
