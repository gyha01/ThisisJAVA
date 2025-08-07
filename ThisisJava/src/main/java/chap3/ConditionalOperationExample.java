package chap3;

public class ConditionalOperationExample {
    public static void main(String[] args){
        int score = 85;

        // 1차 score이 90이 넘는가? true - 'A' / false 뒤의 삼항연산자 실행
        // 2차 (전제: 90이 안 넘음) score이 80이상인가? true - 'B', false - 'C'
        char grade = (score > 90) ? 'A' : ((score > 80 ) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
