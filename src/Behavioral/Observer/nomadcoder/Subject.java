package Behavioral.Observer.nomadcoder;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver(String event);
}
