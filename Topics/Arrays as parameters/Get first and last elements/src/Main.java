import java.util.*;

public class Main {

    public static int[] getFirstAndLast(int[] ai) {
        int[] ao = new int[2];
        ao[0] = ai[0];
        ao[1] = ai[ai.length - 1];
        return ao;
    }// write a method here

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}