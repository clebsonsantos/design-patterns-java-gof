
// Classe que utiliza uma estratégia de pagamento
class ShoppingCart {
  private PaymentStrategy paymentStrategy;

  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void checkout(int amount) {
    if (paymentStrategy != null) {
      paymentStrategy.pay(amount);
    } else {
      System.out.println("Nenhuma estratégia de pagamento definida.");
    }
  }
}
