package chap4;

public class BreakOutterExample {
    public static void main(String[] args) {
        // for문에 Outter라는 라벨을 붙임
        Outter: for(char upper = 'A'; upper <= 'Z'; upper++){
            for(char lower = 'a'; lower <= 'z'; lower++){
                System.out.println(upper + "-" + lower);
                if(lower == 'g'){
                    break Outter;
                }
            }
        }
        System.out.println("프로그램 실행 종료");
    }
}
