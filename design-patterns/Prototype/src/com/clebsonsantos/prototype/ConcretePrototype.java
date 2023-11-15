package com.clebsonsantos.prototype;

class ConcretePrototype implements Prototype {
  private int id;

  public ConcretePrototype(int id) {
    this.id = id;
  }

  // Método de clonagem
  @Override
  public Prototype clone() {
    // Cria uma nova instância e copia os atributos
    return new ConcretePrototype(this.id);
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }
}