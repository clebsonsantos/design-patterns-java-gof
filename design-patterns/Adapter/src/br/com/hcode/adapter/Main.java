package br.com.hcode.adapter;

import br.com.hcode.adapter.adapters.MercadoPagoAdapter;
// import br.com.hcode.adapter.adapters.PayoneerAdapter;
import br.com.hcode.adapter.mercadopago.MercadoPago;
// import br.com.hcode.adapter.payoneer.Payoneer;
import br.com.hcode.adapter.paypal.IPayPalPayments;

public class Main {

    public static void main(String[] args) {

        // IPayonnerPayments payment = new Payoneer();
        // IPayPalPayments payment = new PayoneerAdapter(new Payoneer());

        IPayPalPayments payment = new MercadoPagoAdapter(new MercadoPago());

        payment.paypalPayment();
        payment.paypalReceive();
    }
}
