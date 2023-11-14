package com.clebsonsantos.singleton;

public class Singleton {
  private static Singleton instance;

  private Singleton() {
  }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  public void showMessage() {
    System.out.println("Olá, eu sou uma instância Singleton!");
  }
}
