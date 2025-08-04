package chap2;

public class VariableScopeExample {
    public static void main(String[] args){
/*
        int var1;  // 메소드 블럭에서 선언

        if(...){ //if블록 시작
            // if블록에서 선언
            int var2;
            // var1과 var2 사용 가능
        }// if블록 끝

        for(...){ //for블록 시작
            //for블록에서 선언
            int var3;
            // var1과 var3 사용 가능
            // var2는 사용 못 함
        }
        // var1 사용 가능
        //var2와 var3는 사용 못 함
*/
        int v1 = 15;
        if(v1 > 10){
            int v2 = v1 - 10;
        }
        /*int v3 = v1 + v2 + 5;  // v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생*/
    }
}
