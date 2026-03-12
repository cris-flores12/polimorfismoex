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
public class Carro extends Veículo {
    
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }
    @Override
      public void mover() {
        System.out.println("O carro está dirigindo na estrada. ");
    }
    
}
