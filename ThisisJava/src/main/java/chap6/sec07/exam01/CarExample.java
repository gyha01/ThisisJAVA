package chap6.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        // 클래스에 개발자가 선언한 생성자가 있다면 컴파일러는 기본 생성자를 추가하지 않는다
        // 따라서 기본 생성자를 호출하지 못 함
        //Car myCar = new Car();

        Car myCar = new Car("그랜저", "검정", 250);
    }
}
