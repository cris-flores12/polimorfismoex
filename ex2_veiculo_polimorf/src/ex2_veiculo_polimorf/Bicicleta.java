/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_veiculo_polimorf;

/**
 *
 * @author crisf
 */
public class Bicicleta extends Veículo {
    public Bicicleta (String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }
    @Override
      public void mover() {
        System.out.println("A bicicleta está pedalando pela calçada.");
    }
    
}
