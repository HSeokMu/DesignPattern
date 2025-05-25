package Behavioral.Observer.nomadcoder;

public class ObserverMain {
    public static void main(String[] args) {
        Band band = new Band();

        band.addObserver(new Fan());
        band.addObserver(new Security());
        band.addObserver(new Light());

        band.startConcert();
        band.playSong();
        band.endConcert();
    }
}

