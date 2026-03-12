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
class Flauta extends instrumentos {
    public Flauta(String nome, String tipo, String fabricante) {
        super(nome, tipo, fabricante);
    }

    @Override
    public void tocar() {
        System.out.println("A flauta está emitindo notas suaves");
    }
}
