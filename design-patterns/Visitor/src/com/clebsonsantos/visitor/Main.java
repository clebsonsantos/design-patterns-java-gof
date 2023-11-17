package com.clebsonsantos.visitor;

public class Main {
  public static void main(String[] args) {
    // Construindo a árvore de expressão: 2 + (3 + 4)
    Visitable expression = new AdditionExpression(
        new NumberElement(2),
        new AdditionExpression(new NumberElement(3), new NumberElement(4)));

    // Criando um visitor para avaliar a expressão
    Visitor evaluator = new ExpressionEvaluator();

    // Aceitando o visitor na expressão
    expression.accept(evaluator);

    // Obtendo o resultado da avaliação
    int result = ((ExpressionEvaluator) evaluator).getResult();
    System.out.println("Resultado da expressão: " + result);
  }
}