import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();


        List<String> lst1 = Arrays.asList(str1.split(" "));
        List<String> lst2 = Arrays.asList(str2.split(" "));


        boolean b =lst1.containsAll(lst2) && (lst1.size() > lst2.size());
        System.out.println( (b) ? "You get money" : "You are busted");


    }
}