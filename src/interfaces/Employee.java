package interfaces;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Yuan Zhibo
 * @ClassName Employee.java
 * @Description TODO
 * @createTime 2020年03月20日 21:52:00
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public double getSalary() {
        return salary;
    }


    public void raiseSalary(double percent){
        salary = salary * (1 + percent/100);
    }

    public int compareTo(Employee other){
        return Double.compare(salary, other.salary);
    }
}
