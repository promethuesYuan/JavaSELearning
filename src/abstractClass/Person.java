package abstractClass;

/**
 * @author Yuan Zhibo
 * @ClassName Person.java
 * @Description TODO
 * @createTime 2020年03月19日 20:16:00
 */
public abstract class Person {
    public abstract String getDescription();

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
