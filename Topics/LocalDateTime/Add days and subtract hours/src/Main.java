import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime ldt = LocalDateTime.parse(scanner.next());
        int d = scanner.nextInt();
        int h = scanner.nextInt();

        System.out.println(ldt.plusDays(d).minusHours(h));
    }
}