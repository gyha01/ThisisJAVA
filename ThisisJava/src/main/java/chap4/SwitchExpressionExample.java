package chap4;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        // 예제 SwitchCharExample를 자바 12이후 적용된 Expressions(표현식)을 사용한 예제
        char grade = 'B';

        switch (grade){
            case 'A', 'a' -> {
                System.out.println("우수 회원입니다.");
            }
            case 'B', 'b' -> {
                System.out.println("일반 회원입니다.");
            }
            default -> {
                System.out.println("손님입니다.");
            }
        }

        // 중괄호 안에 실행문이 하나만 있을 경우 중괄호를 생략할 수 있음
        // 위의 코드에서 중괄호 생략
        switch(grade){
            case 'A', 'a' -> System.out.println("우수 회원입니다.");
            case 'B', 'b' -> System.out.println("일반 회원입니다.");
            default -> System.out.println("손님입니다.");
        }
    }
}
