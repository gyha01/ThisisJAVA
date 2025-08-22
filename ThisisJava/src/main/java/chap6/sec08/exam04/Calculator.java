package chap6.sec08.exam04;

public class Calculator {
    // 정사각형의 넓이
    // 오버로딩으로 여러 개의 메소드 선언
    double areaRectangle(double width){
        return width * width;
    }

    // 직사각형의 넓이
    double areaRectangle(double width, double height){
        return width * height;
    }
}
