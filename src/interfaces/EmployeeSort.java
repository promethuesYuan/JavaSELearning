package interfaces;

import java.util.Arrays;

/**
 * @author Yuan Zhibo
 * @ClassName EmployeeSort.java
 * @Description TODO
 * @createTime 2020年03月20日 21:58:00
 */
public class EmployeeSort {
    public static void main(String[] args) {
        Employee[] staff =  new Employee[3];

        staff[0] = new Employee("harry", 35000);
        staff[1] = new Employee("carl", 75000);
        staff[2] = new Employee("tony", 38000);

        Arrays.sort(staff);

        for(Employee employee: staff){
            System.out.println("name="+employee.getName() + " ,salary=" + employee.getSalary());
        }
    }
}
