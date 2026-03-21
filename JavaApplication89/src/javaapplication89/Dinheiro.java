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
class Dinheiro extends Pagamento {
    public Dinheiro(double valor, String data, String descricao) {
        super(valor, data, descricao);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento em Dinheiro recebido: R$" + getValor());
    }
}