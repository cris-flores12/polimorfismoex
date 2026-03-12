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
public class Ex2_veiculo_polimorf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veículo v1 = new Carro("Toyota", "Corolla", 2020);
        Veículo v2 = new Moto("Honda", "CB500", 2019);
        Veículo v3 = new Bicicleta("Caloi", "Elite", 2022);
        Veículo v4 = new Aviao("Boeing", "747", 2015);
        Veículo v5 = new Barco("Yamaha", "WaveRunner", 2021);

       
        v1.mover();
        v1.getMarca();
        v1.getAno();
        v1.getModelo();
System.out.println("  ");
        v2.mover();
        v2.getModelo();
        v2.getAno();
         v2.getMarca();
       System.out.println("  ");
        v3.mover();
         v3.getModelo();
         v3.getAno();
          v3.getMarca();
        v4.mover();
        v4.getMarca();
        v4.getAno();
        v4.getModelo();
          System.out.println("  ");
        v5.mover();
        v5.getModelo();
         v5.getAno();
        v5.getMarca();
    }
    
}
