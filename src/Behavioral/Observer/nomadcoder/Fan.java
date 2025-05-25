package Behavioral.Observer.nomadcoder;

public class Fan implements Observer {
    @Override
    public void notify(String event) {
        if("START".equalsIgnoreCase(event)) {
            System.out.println("YaY!");
        } else if("END".equalsIgnoreCase(event)) {
            System.out.println("Thank You! Bye!");
        }
    }
}
