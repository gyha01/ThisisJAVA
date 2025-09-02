package chap6.sec12.hyundai;

//import 문으로 다른 패키지 클래스 사용을 명시
import chap6.sec12.hankook.SnowTire;
import chap6.sec12.kumho.AllSeasonTire;

public class Car {
    // 부품 필드 선언
    // 이처럼 클래스 전체 이름을 사용할 경우 import 문은 사용할 필요가 없음
    chap6.sec12.hankook.Tire tire1 = new chap6.sec12.hankook.Tire();
    chap6.sec12.kumho.Tire tire2 = new chap6.sec12.kumho.Tire();

    SnowTire tire3 = new SnowTire();
    AllSeasonTire tire4 = new AllSeasonTire();
}
