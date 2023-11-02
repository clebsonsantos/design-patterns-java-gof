package br.com.hcode.adapter.mercadopago;

import br.com.hcode.adapter.utils.Token;

public interface IMercadoPagoPayments {
  Token authToken();

  void pay();

  void receiver();
}
