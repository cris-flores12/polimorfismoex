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
class CartaoCredito extends pagamento {
    private String numeroCartao;

    public CartaoCredito(double valor, double data, String descrição) {
        super(valor, data, descrição);
    }
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento com Cartão de Crédito: " + getDescricao() +
                           " no valor de R$" + getValor() +
                           " usando cartão " + numeroCartao);
    }
}
