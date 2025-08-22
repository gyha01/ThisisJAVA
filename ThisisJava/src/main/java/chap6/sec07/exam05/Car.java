package chap6.sec07.exam05;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 1번 생성자
    Car(String model){
        // 20라인 생성자 호출
        this(model, "은색", 250);
    }

    // 2번 생성자
    Car(String model, String color){
        // 20라인 생성자 호출
        this(model, color, 250);
    }

    // 3번 생성자 - 공통 초기화 코드
    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

/*  위의 코드의 중복 코드 생략 전 모습
    Car(String model){
        this.model = model;
        this.color = "은색";
        this.maxSpeed = 250;
    }

    Car(String model, String color){
        this.model = model;
        this.color = color;
        this.maxSpeed = 250;
    }

    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    */

}
