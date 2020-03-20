package clone;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * @author Yuan Zhibo
 * @ClassName Employee.java
 * @Description TODO
 * @createTime 2020年03月20日 22:26:00
 */
public class Employee implements Cloneable {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    public String getName(){
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void  setHireDay(int year, int month, int day){
        Date newHireDay = new GregorianCalendar(year, month-1, day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }


    public void raiseSalary(double percent){
        salary = salary * (1 + percent/100);
    }


    public String toString(){
        return getClass().getName() + "[name=" + name + " ,salary=" + salary + " ,hireDay=" + hireDay +"]";
    }

    public Employee clone() throws CloneNotSupportedException{
        Employee cloned = (Employee) super.clone();
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }
}
