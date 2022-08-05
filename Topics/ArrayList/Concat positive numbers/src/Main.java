import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Collectors;

class ConcatPositiveNumbersProblem {

    public static ArrayList<Integer> concatPositiveNumbers(ArrayList<Integer> l1, ArrayList<Integer> l2) {

        /*        Iterator<Integer> l1tIterator = l1.iterator();
        Iterator<Integer> l2tIterator = l2.iterator();

        while(l1tIterator.hasNext()) {
            Integer v1 = l1tIterator.next();
            if (v1 < 0) l1tIterator.remove();
        }

        while(l2tIterator.hasNext()) {
            Integer v2 = l2tIterator.next();
            if (v2 < 0) l2tIterator.remove();
        }

        l1.addAll(l2);
*/
        l1.addAll(l2);
        l1.removeIf(n -> n < 0);

        return l1; // write your code here
    }

    /* Do not modify this method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = readArrayList(scanner);
        ArrayList<Integer> list2 = readArrayList(scanner);

        ArrayList<Integer> result = concatPositiveNumbers(list1, list2);

        result.forEach(n -> System.out.print(n + " "));
    }

    /* Do not modify this method */
    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}