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
public class pagamento {
    private double valor ;
    private double data;
    private String descricao;
    public pagamento(double valor, double data, String descrição){
        this.valor=valor;
        this.data=data;
        this.descricao=descrição;       
    }
     public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getdata() {
        return data;
    }

    public void setdata(double data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   
    public void processarPagamento() {
        System.out.println("Processando pagamento de R$" + valor + " - " + descricao);
    }

}
