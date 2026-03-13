/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_pagamento;

/**
 *
 * @author crisf
 */
class Dinheiro extends pagamento {

    public Dinheiro(double valor, double data, String descrição) {
        super(valor, data, descrição);
    }


    @Override
    public void processarPagamento() {
        System.out.println("Pagamento em Dinheiro: R$" + getValor() +
                           " - " + getDescricao());
    }
}