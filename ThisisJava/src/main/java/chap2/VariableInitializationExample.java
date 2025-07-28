package chap2;

public class VariableInitializationExample {
    public static void main(String[] args){

        /* 컴파일 오류 발생
        // 변수 value 선언
        int value;

        //연산 결과를 변수 result의 초기값으로 대입
        int result = value + 10; //  <-- 일부로 오류를 일으킨 것

        //변수 result 값을 읽고 출력
        // --> value 값이 선언되지 않아서 오류로 실행되지 않음
        System.out.println(result);*/

        // 정상적으로 실행하기 위해서는 이렇게 고쳐야 함
        int value = 30;

        int result = value + 10;

        System.out.println(result);

    }
}
