package Behavioral.Observer.org;

import java.util.ArrayList;
import java.util.Random;

public class WeatherAPI implements ISubject {
    float temp;     // 온도
    float humidity; // 습도
    float pressure; // 기압

    // 구독자를 관리하는 리스트
    ArrayList<IObserver> subscribers = new ArrayList<>();

    void measurementsChanged() {
        temp     = new Random().nextFloat() * 100;
        humidity = new Random().nextFloat() * 100;
        pressure = new Random().nextFloat() * 100;

        // 온습도 값이 변화하면 바로 옵저버들에게 발행
        notifyObserver();
    }

    @Override
    public void registerObserver(IObserver o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        subscribers.remove(o);
    }

    // 이벤트 전파
    @Override
    public void notifyObserver() {
        for(IObserver subscriber : subscribers ) {
            subscriber.display(this);   // 자신의 객체를 매개변수로 줘서 현재 자신의 상태를 구독자에게 알림
        }
    }
}
