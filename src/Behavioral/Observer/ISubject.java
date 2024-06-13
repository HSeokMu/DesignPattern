package Behavioral.Observer;

public interface ISubject {
    void registerObserver(IObserver o); // 구독 추가
    void removeObserver(IObserver o);   // 구독 삭제
    void notifyObserver();              // subject 객체의 상태 변경 시 이를 모든 옵저버들에게 알림
}
