package chap2;

// Scanner가 java.util 패키지에 있다는 것을 컴파일러에게 알려주는 역할을 함
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 값 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: " + result);
        System.out.println();

        // 중괄호 {} 안을 무한히 반복 실행함
        while(true){
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();

            //입력된 문자열이 q라면 반복을 중지
            if(data.equals("q")){
                break;
            }
            System.out.println("출력 문자열: "+ data);
            System.out.println();
        }
        System.out.println("종료");
    }
}
