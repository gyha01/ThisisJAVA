package chap4;

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "B";

        // Java 11 이전 문법
        int score1 = 0;
        switch (grade) {
            case "A":
                score1 = 100;
                break;
            case "B":
                int result = 100 - 20;
                score1 = result;
                break;
            default:
                score1 = 60;
        }
        System.out.println("score1: " + score1);


        // Java 12부터 가능
        int score2 = switch(grade){
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;

                // Java 13부터 가능
                // 중괄호를 사용할 경우 yield 키워드로 값을 지정하면 됨
                // 단, default가 반드시 존재해야 함
                yield result;
            }
            default -> 60;
            };
        System.out.println("score2: " + score2);
        }
    }
