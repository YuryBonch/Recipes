import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        // write your code here
        String ss = "";
        int len = 0;
        for (String s: list) {
//            System.out.println(s);
            if (s.length() > len) {
                len =s.length();
                ss = s;

            }
        }

        //list.replaceAll(ss);
        for (int i =0; i< list.size(); i++) {
            list.set(i,ss);
        }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}