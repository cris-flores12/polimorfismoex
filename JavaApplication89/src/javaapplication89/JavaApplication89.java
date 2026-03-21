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
public class JavaApplication89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Pagamento p1 = new CartaoCredito(150.0, "19/03/2026", "Compra no mercado");
        Pagamento p2 = new Pix(200.0, "19/03/2026", "Pagamento de serviço");
        Pagamento p3 = new Dinheiro(50.0, "19/03/2026", "Lanche");
        Pagamento p4 = new Boleto(500.0, "19/03/2026", "Mensalidade escolar");
        Pagamento p5 = new TransferenciaBancaria(1000.0, "19/03/2026", "Aluguel");

        p1.processarPagamento();
        p2.processarPagamento();
        p3.processarPagamento();
        p4.processarPagamento();
        p5.processarPagamento();
    }
}