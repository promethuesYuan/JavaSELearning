package abstractClass;

/**
 * @author Yuan Zhibo
 * @ClassName Student.java
 * @Description TODO
 * @createTime 2020年03月19日 20:18:00
 */
public class Student extends Person {
    private String major;

    public Student(String name, String major){
        super(name);
        this.major = major;
    }

    public String getDescription(){
        return "a student majoring in " + major;
    }
}
