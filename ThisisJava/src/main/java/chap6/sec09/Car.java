package chap6.sec09;

public class Car {
    // 필드 선언
    String model;
    int speed;

    // 생성자 선언
    Car(String model){
        // 매개변수를 필드에 대입(this 생략 불가)
        this.model = model;
    }

    // 메서드 선언
    void setSpeed(int speed){
        // 매개변수를 필드에 대입(this 생략 불가)
        this.speed = speed;
    }

    void run(){
        // 여기에 있는 this는 생략 가능
        this.setSpeed(100);
        System.out.println(this.model + "가 달립니다. (시속: " + this.speed + "km/h)");
    }
}
