import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String ch = scanner.next();

        List<String> myList = new ArrayList<String>(Arrays.asList(str.split(" ")));
        System.out.println(Collections.frequency(myList, ch));


    }
}