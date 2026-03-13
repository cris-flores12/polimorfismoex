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
public class Designer extends Funcionario {

    public Designer (String nome, String setor, double salário) {
        super(nome, setor, salário);
    }

 
   
    @Override
    public void trabalhar(){
          System.out.println("O designer está criando layouts e artes visuais");
    }
}
