package com.clebsonsantos.observer;

public class Main {
  public static void main(String[] args) {
    // Criar um objeto sujeito.
    Subject subject = new Subject();

    // Criar observadores.
    Observer observer1 = new ConcreteObserver("Observador 1");
    Observer observer2 = new ConcreteObserver("Observador 2");

    // Registrar observadores com o sujeito.
    subject.addObserver(observer1);
    subject.addObserver(observer2);

    // Alterar o estado do sujeito e notificar os observadores.
    subject.setState("Novo estado do sujeito");

    // Saída:
    // Observador 1 recebeu a mensagem: Novo estado do sujeito
    // Observador 2 recebeu a mensagem: Novo estado do sujeito
  }
}