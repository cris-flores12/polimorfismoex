/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_instrumentos;

/**
 *
 * @author crisf
 */
public class Ex3_instrumentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          instrumentos i1 = new Violao("Violão Clássico", "Cordas", "Yamaha");
        instrumentos i2 = new Piano("Piano de Cauda", "Teclas", "Steinway");
        instrumentos i3 = new Bateria("Bateria Rock", "Percussão", "Pearl");
        instrumentos i4 = new Flauta("Flauta Transversal", "Sopro", "Yamaha");
        instrumentos i5 = new Guitarra("Guitarra Elétrica", "Cordas", "Fender");

        // Testando polimorfismo
        i1.tocar();
        i2.tocar();
        i3.tocar();
        i4.tocar();
        i5.tocar();
    }
}
