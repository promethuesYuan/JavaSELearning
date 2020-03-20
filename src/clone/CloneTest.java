package clone;

/**
 * @author Yuan Zhibo
 * @ClassName CloneTest.java
 * @Description cloneable 标记接口
 * @createTime 2020年03月20日 22:30:00
 */
public class CloneTest {
    public static void main(String[] args) {
        try {
            Employee original = new Employee("John", 50000);
            original.setHireDay(2000, 1,1);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002,12,31);
            System.out.println("original=" + original);
            System.out.println("copy=" + copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        repeat(10, () -> System.out.println("Hello world!"));
    }

    public static void repeat(int n, Runnable action){
        for(int i = 0; i< n ; i++) action.run();
    }
}
