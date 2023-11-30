import java.util.ArrayList;
import java.util.List;

class CompositeGraphic implements Graphic {
  private List<Graphic> graphics = new ArrayList<>();

  // Adiciona um componente gráfico à composição
  public void add(Graphic graphic) {
    graphics.add(graphic);
  }

  @Override
  public void draw() {
    System.out.println("Desenhando a composição:");
    for (Graphic graphic : graphics) {
      graphic.draw();
    }
  }
}