public class Main {
  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();

    // Escolhendo a estratégia de pagamento com cartão de crédito
    cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9101-1121"));
    cart.checkout(100);

    // Trocando para a estratégia de pagamento com PayPal
    cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
    cart.checkout(50);
  }
}
