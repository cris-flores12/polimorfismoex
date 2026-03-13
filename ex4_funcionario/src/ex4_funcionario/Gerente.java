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
public class Gerente extends Funcionario {
    
    public Gerente(String nome, String setor, double salário) {
        super(nome, setor, salário);
    }
    @Override
    public void trabalhar(){
        System.out.println("O gerente está coordenando a equipe");
    }
    
}
