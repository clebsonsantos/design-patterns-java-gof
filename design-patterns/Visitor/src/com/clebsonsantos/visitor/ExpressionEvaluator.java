package com.clebsonsantos.visitor;

class ExpressionEvaluator implements Visitor {
  private int result;

  public int getResult() {
    return result;
  }

  @Override
  public void visit(NumberElement element) {
    result = element.getValue();
  }

  @Override
  public void visit(AdditionExpression expression) {
    expression.getLeft().accept(this);
    int leftValue = getResult();

    expression.getRight().accept(this);
    int rightValue = getResult();

    result = leftValue + rightValue;
  }
}
