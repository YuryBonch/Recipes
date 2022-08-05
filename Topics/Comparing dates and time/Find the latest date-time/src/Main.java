import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        LocalDateTime ld0 = LocalDateTime.MIN;

        while (scanner.hasNext()) {
            LocalDateTime ld1 = LocalDateTime.parse(scanner.next());
            if (ld1.isAfter(ld0)) ld0 = ld1;
        }

        System.out.println(ld0);
    }
}