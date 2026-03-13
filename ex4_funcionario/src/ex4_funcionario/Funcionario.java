/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4_funcionario;

/**
 *
 * @author crisf
 */
public class Funcionario {
    private String nome;
    private double salário;
    private String setor;
    public Funcionario(String nome, String setor,double salário){
        this.nome=nome;
        this.setor=setor;
        this.salário=salário;       
    }
    public String getnome(){
        return nome;
    }     
    public void setnome(String nome){
        this.nome=nome;
    }
    public double getnsalário(){
        return salário;
    }     
    public void setsalário(double salário){
        this.salário=salário;
    }
    public String getsetor(){
        return setor;
    }     
    public void setsetor(String setor){
        this.setor=setor;
    }
    public void trabalhar(){
        System.out.println("o funcionário está trabalhando");
    }
    
}
