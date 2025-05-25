package Behavioral.Observer.nomadcoder;

import java.util.ArrayList;
import java.util.List;

public class Band implements Subject{
    List<Observer> observer = new ArrayList<>();


    @Override
    public void addObserver(Observer o) {
        this.observer.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observer.remove(o);
    }

    @Override
    public void notifyObserver(String event) {
        observer.forEach(o -> o.notify(event));
    }

    public void startConcert() {
        this.notifyObserver("START");
    }

    public void playSong() {
        this.notifyObserver("PLAY SONG");
    }

    public void endConcert() {
        this.notifyObserver("END");
    }
}
