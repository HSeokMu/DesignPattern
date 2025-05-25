package Behavioral.Observer.nomadcoder;

public class Light implements Observer {
    @Override
    public void notify(String event) {
        if("PLAY SONG".equalsIgnoreCase(event)) {
            System.out.println("★ ☆ ★");
        }
    }
}
