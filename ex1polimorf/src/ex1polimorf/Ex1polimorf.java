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
public class Ex1polimorf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Animal a1 = new Cachorro("Kira", 5, 20.5);
        Animal a2 = new Gato("Mimi", 3, 4.2);
        Animal a3 = new Vaca("Malhada", 7, 250.0);
        Animal a4 = new Cavalo("Pé de Pano", 10, 400.0);
        Animal a5 = new Leao("Simba", 6, 190.0);

      
        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
        a4.emitirSom();
        a5.emitirSom();
    }
    }
    

