package play.tak.util;

public abstract class Observer<T> {
  public abstract void receiveChange(T change);
}
