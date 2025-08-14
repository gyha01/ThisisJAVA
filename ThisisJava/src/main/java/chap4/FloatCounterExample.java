package chap4;

public class FloatCounterExample {
    public static void main(String[] args) {
        // 부동 소수점을 쓰는 float타입을 쓰면 안되는 이유
        for(float x = 0.1f; x <= 1.0f; x+=0.1f){
            System.out.println(x);
        }
    }
}
