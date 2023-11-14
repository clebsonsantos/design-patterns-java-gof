package com.clebsonsantos.singleton;

public class Main {
  public static void main(String[] args) {
    // Exemplo de uso do Singleton
    Singleton singletonInstance1 = Singleton.getInstance();
    singletonInstance1.showMessage();

    Singleton singletonInstance2 = Singleton.getInstance();
    singletonInstance2.showMessage();

    // Verifica se as duas instâncias são iguais
    System.out.println("As duas instâncias são iguais: " + (singletonInstance1 == singletonInstance2));
  }
}
