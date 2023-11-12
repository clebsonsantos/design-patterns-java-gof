package com.clebsonsantos.observer;

import java.util.ArrayList;
import java.util.List;

class Subject {
  private List<Observer> observers = new ArrayList<>();
  private String state;

  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void setState(String state) {
    this.state = state;
    notifyObservers();
  }

  private void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(state);
    }
  }
}