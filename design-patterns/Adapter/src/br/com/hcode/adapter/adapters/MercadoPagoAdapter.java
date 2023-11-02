package br.com.hcode.adapter.adapters;

import br.com.hcode.adapter.mercadopago.MercadoPago;
import br.com.hcode.adapter.paypal.IPayPalPayments;
import br.com.hcode.adapter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {
  private MercadoPago mercadoPago;

  public MercadoPagoAdapter(MercadoPago mercadoPago) {
    this.mercadoPago = mercadoPago;
    System.out.println("Adaptando para o Mercado Pago");
  }

  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void paypalPayment() {
    this.mercadoPago.pay();
  }

  @Override
  public void paypalReceive() {
    this.mercadoPago.receiver();
  }
}
