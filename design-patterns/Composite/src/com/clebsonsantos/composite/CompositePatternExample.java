public class CompositePatternExample {
  public static void main(String[] args) {
    // Criando objetos folha
    Graphic ellipse = new Ellipse();
    Graphic square = new Square();

    // Criando objeto composto
    CompositeGraphic compositeGraphic = new CompositeGraphic();
    compositeGraphic.add(ellipse);
    compositeGraphic.add(square);

    // Chamando o método draw em objetos folha e composto
    ellipse.draw();
    square.draw();
    compositeGraphic.draw();
  }
}