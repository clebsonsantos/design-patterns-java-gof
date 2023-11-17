package com.clebsonsantos.visitor;

class AdditionExpression implements Visitable {
  private Visitable left;
  private Visitable right;

  public AdditionExpression(Visitable left, Visitable right) {
    this.left = left;
    this.right = right;
  }

  public Visitable getLeft() {
    return left;
  }

  public Visitable getRight() {
    return right;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
