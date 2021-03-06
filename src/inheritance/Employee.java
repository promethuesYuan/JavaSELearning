package inheritance;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Yuan Zhibo
 * @ClassName Employee.java
 * @Description TODO
 * @createTime 2020年03月19日 19:45:00
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName(){
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }


    public void raiseSalary(double percent){
        salary = salary * (1 + percent/100);
    }

    public boolean equals(Object otherObject){
        if(this == otherObject) return true;
        if(otherObject == null) return false;
        if(getClass() != otherObject.getClass()) return false;

        Employee other = (Employee) otherObject;

        return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);
    }

    public int hashCode(){
        return Objects.hash(name, salary, hireDay);
    }

    public String toString(){
        return getClass().getName() + "[name=" + name + " ,salary=" + salary + " ,hireDay=" + hireDay +"]";
    }
}
