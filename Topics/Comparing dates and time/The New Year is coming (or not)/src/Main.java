import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        final Scanner scanner = new Scanner(System.in);
        LocalDate ld = LocalDate.parse(scanner.next());
        final int day = scanner.nextInt();

        ld = ld.plusDays(day);
        System.out.println(ld.getDayOfYear() == 1);
    }
}
