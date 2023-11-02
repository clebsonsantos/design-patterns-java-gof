package br.com.hcode.adapter.mercadopago;

import br.com.hcode.adapter.utils.Token;

public class MercadoPago implements IMercadoPagoPayments {

  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void pay() {
    System.out.println("Pagando via Mercado Pago");
  }

  @Override
  public void receiver() {
    System.out.println("Recebendo via Mercado Pago");
  }

}
