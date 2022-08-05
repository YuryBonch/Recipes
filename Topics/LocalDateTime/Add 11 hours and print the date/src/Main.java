import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        final int HOURS = 11;
        Scanner scanner = new Scanner(System.in);
        LocalDateTime ldt = LocalDateTime.parse(scanner.next());
        System.out.println(ldt.plusHours(HOURS).toLocalDate());
    }
}