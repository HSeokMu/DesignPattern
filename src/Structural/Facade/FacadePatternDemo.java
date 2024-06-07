package Structural.Facade;

/**
 * 클라이언트 코드
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        // 서브시스템 객체들 생성
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();

        // 파사드 객체 생성
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector);

        // 영화 감상 시작
        homeTheater.watchMovie("Inception");

        // 영화 감상 종료
        homeTheater.endMovie();
    }
}
