package inheritance;

/**
 * @author Yuan Zhibo
 * @ClassName ManagerTest.java
 * @Description TODO
 * @createTime 2020年03月19日 19:52:00
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker" ,80000,1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Haryy Cracker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy", 4000, 1900,3,15);

        if(staff[0] instanceof Manager) System.out.println("yes");

        for(Employee employee : staff){
            System.out.println("name=" + employee.getName() + " ,salary = "+employee.getSalary());
        }
    }
}
