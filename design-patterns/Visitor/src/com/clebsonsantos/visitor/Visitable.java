package com.clebsonsantos.visitor;

interface Visitable {
  void accept(Visitor visitor);
}