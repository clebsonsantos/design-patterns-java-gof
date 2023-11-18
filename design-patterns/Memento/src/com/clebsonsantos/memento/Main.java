
public class Main {
  public static void main(String[] args) {
    Originator originator = new Originator();
    CareTaker careTaker = new CareTaker();

    originator.setState("Estado #1");
    originator.setState("Estado #2");
    careTaker.addMemento(originator.saveStateToMemento());

    originator.setState("Estado #3");
    careTaker.addMemento(originator.saveStateToMemento());

    originator.setState("Estado #4");
    System.out.println("Estado Atual: " + originator.getState());

    // Restaurar para o segundo estado
    originator.restoreStateFromMemento(careTaker.getMemento(1));
    System.out.println("Estado Restaurado: " + originator.getState());
  }
}
