import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime ldt2 = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime ldt1 = LocalDateTime.of(ldt2.toLocalDate().getYear(), 1, 1, 0, 0, 0);

        long diff = ldt1.until(ldt2, ChronoUnit.HOURS);
        System.out.println(diff);
    }
}