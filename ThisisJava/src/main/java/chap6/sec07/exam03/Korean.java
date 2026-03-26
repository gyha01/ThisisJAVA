package chap6.sec07.exam03;

public class Korean {
    // 필드 선언
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자 선언
    // this는 현재 객체
    // this.name은 현재 객체의 데이터(필드)의 name
    public Korean(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }
}
