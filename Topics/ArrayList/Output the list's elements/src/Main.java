import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        // write your code here
//        for (String str: nameList) {
//            System.out.println(str);
//        }

        nameList.forEach(s -> System.out.println(s));
    }
}