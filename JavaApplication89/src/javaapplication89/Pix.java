/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication89;

/**
 *
 * @author crisf
 */
class Pix extends Pagamento {
    public Pix(double valor, String data, String descricao) {
        super(valor, data, descricao);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Pix realizado: R$" + getValor());
    }
}
