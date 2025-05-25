package Behavioral.Observer.org;

public class ObserverDemo {
    public static void main(String[] args) {
        WeatherAPI api = new WeatherAPI();

        api.registerObserver(new KoreanObserver(api, "홍길동"));
        api.registerObserver(new KoreanObserver(api, "임꺽정"));
        api.registerObserver(new KoreanObserver(api, "이방원"));

        // 온습도기에서 현재 상태의 온습도 정보가 갱신됨
        api.measurementsChanged();

        // 알아서 전파되어 출력
        api.measurementsChanged();
    }
}
