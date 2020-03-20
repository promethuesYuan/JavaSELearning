package abstractClass;

import java.util.Arrays;

/**
 * @author Yuan Zhibo
 * @ClassName PersonTest.java
 * @Description TODO
 * @createTime 2020年03月19日 20:20:00
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("Haryy Cracker", 50000, 1989, 10, 1);
        people[1] = new Student("Mario Morris", "cs");

        for (Person person : people){
            System.out.println(person.getDescription());
        }

        int[] arr1 = {1, 2 ,3};
        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.equals(arr1, arr2));
    }
}

class MyTest{
    protected String get(){
        return "haha";
    }
}