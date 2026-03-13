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
public class Ex4_funcionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f1=new Gerente("carlos","administração",700.0);
        Funcionario f2=new Vendedor("Davi","comercial",800.0);
        Funcionario f3=new Programador("Cristian","TI",900.0);
        Funcionario f4=new Designer("Maria","Design",600.0);
        Funcionario f5=new SuporteTecnico("Vitor","Suporte",900.0);
        f1.trabalhar();
        f2.trabalhar();
        f3.trabalhar();
        f4.trabalhar();
        f5.trabalhar();
    }
    
}
