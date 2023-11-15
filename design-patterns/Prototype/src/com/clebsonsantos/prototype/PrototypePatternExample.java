package com.clebsonsantos.prototype;

public class PrototypePatternExample {
  public static void main(String[] args) {
    // Cria um protótipo
    ConcretePrototype prototype = new ConcretePrototype(1);

    // Clona o protótipo para obter uma nova instância
    ConcretePrototype clonedInstance = (ConcretePrototype) prototype.clone();

    // Verifica se os dois objetos são distintos, mas têm os mesmos atributos
    System.out.println("ID do protótipo: " + prototype.getId());
    System.out.println("ID do objeto clonado: " + clonedInstance.getId());
    System.out.println("Os dois objetos são iguais: " + (prototype != clonedInstance));
  }
}
