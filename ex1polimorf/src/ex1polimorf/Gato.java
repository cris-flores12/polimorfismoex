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
public class Gato extends Animal {

    public Gato(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }
    @Override
     void emitirSom() {
        System.out.println("O gato mia.");
    }
}
