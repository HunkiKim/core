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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
