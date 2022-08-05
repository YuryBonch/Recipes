import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        SortedSet<Integer> list9 = new TreeSet<>();
        list9.subSet()

        int count_word = Integer.parseInt(scanner.nextLine());
        Set<String> list0 = new TreeSet<>();

        for (int i=0; i<count_word; i++) {
            list0.add(scanner.nextLine().toLowerCase(Locale.ROOT));
        }

        int count_line = Integer.parseInt(scanner.nextLine());
        Set<String> list1 = new TreeSet<>();

        for (int i=0; i<count_line; i++) {
            Set<String> set1 = readStringSet(scanner);
            list1.addAll(set1);
        }

        list1.forEach(e -> {
            if (!list0.contains(e.toLowerCase(Locale.ROOT))) System.out.println(e);
        });
    }

    private static Set<String> readStringSet(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toSet());
    }
}