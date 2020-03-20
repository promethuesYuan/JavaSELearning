package abstractClass;

import java.time.LocalDate;

/**
 * @author Yuan Zhibo
 * @ClassName Employee.java
 * @Description TODO
 * @createTime 2020年03月19日 20:15:00
 */
public class Employee extends Person{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public String getDescription(){
        return String.format("an employee with a salary of %.2f", salary);
    }

    public void raiseSalary(double percent){
        salary = salary * (1 + percent/100);
    }
}
