package play.tak.util;

import java.util.List;

public class Observable<T> {
  private List<Observer<T>> observers;

  public void addObserver(Observer<T> x) {
    observers.add(x);
  }

  public boolean removeObserver(Observer<T> x) {
    return observers.remove(x);
  }

  public int nObservers() {
    return observers.size();
  }

  protected void notifyObservers(List<T> changes) {
    changes.forEach(c -> notifyObservers(c));
  }

  protected void notifyObservers(T change) {
    observers.forEach(o -> o.receiveChange(change));
  }
}
