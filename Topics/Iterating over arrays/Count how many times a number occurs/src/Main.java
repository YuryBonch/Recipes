import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList();
        for (int i=0; i< size; i++) {
            array.add(scanner.nextInt());
        }
        //String str = scanner.nextLine();
        int find = scanner.nextInt();
        int cnt = 0;

        //int count_word = Integer.parseInt(scanner.nextLine());

        //List<String> lst = Arrays.asList(str.split(" "));
        //Set<Integer> ret = new HashSet<>();
        //lst.forEach(e -> ret.add(Integer.valueOf(e)));

        for (Integer dig: array) {
            if (dig == find) cnt++;
        }

        System.out.println(cnt);
    }
}