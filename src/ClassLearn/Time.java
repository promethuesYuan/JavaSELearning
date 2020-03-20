package ClassLearn;

import java.time.LocalDate;

/**
 * @author Yuan Zhibo
 * @ClassName Time.java
 * @Description TODO
 * @createTime 2020年03月18日 17:26:00
 */
public class Time {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(1999, 3, 15);
        LocalDate aYearLater = ld.plusDays(365);
        System.out.println(aYearLater.getYear());
    }
}
