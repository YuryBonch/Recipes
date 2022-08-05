import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<String> list1 = List.of(scanner.nextLine().split(" "));
        List<String> list2 = List.of(scanner.nextLine().split(" "));
        //System.out.println(list1);
        //System.out.println("---");
        //System.out.println(list2);
        int i1 = Collections.indexOfSubList(list1, list2);
        int i2 = Collections.lastIndexOfSubList(list1, list2);
        System.out.println(String.format("%d %d", i1, i2));


    }
}