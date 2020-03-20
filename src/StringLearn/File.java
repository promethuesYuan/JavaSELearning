package StringLearn;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author Yuan Zhibo
 * @ClassName File.java
 * @Description TODO
 * @createTime 2020年03月18日 16:19:00
 */
public class File {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(Paths.get("E:\\java_project\\Java_learning\\src\\ioTest"), "UTF-8");
        PrintWriter out = new PrintWriter("E:\\java_project\\Java_learning\\src\\outTest", "UTF-8");
        while (in.hasNextLine()){
            String a = in.nextLine();
            System.out.println(a);
            out.println(a + "****");
        }

    }
}
