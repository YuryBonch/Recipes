import java.util.*;
import java.util.stream.IntStream;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();
        IntStream s1 = scanner.nextLine().toLowerCase().chars();
        IntStream s2 = scanner.nextLine().toLowerCase().chars();

        s1.forEach(s -> {
            String str = String.valueOf(s);
            map.put(str, map.getOrDefault(str, 0) + 1);
        });

        s2.forEach(s -> {
            String str = String.valueOf(s);
            map.put(str, map.getOrDefault(str, 0) - 1);
        });

        int cnt = 0;
        for (Integer value : map.values()) {
            cnt += Math.abs(value);
        }

        System.out.println(cnt);


    }
}