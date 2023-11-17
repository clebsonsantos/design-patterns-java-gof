package com.clebsonsantos.visitor;

class NumberElement implements Visitable {
  private int value;

  public NumberElement(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}