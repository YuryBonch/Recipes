import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<Integer> list_num = Arrays.stream(str.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int cnt = scanner.nextInt();
        for (int i=0; i<cnt; i++) {
            int i1 = scanner.nextInt();
            int i2 = scanner.nextInt();
            Collections.swap(list_num, i1, i2);
        }

        list_num.forEach(e -> System.out.print(e + " "));

    }
}