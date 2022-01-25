package hello.core.member;

public class Member {
    private Long id;
    private String name;
    private Grade grade;  // Enum 열거체를 사용하면 하나의 클래스로 Grade grade는 두 가지 바께 안뎀

    public Member(String name, Grade grade,Long id) {
        this.name = name;
        this.grade = grade;
        this.id = id;
    }


}
