package com.clebsonsantos.visitor;

interface Visitor {
  void visit(NumberElement element);

  void visit(AdditionExpression expression);
}