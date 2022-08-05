import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        final Scanner scanner = new Scanner(System.in);
        LocalDate ld1 = LocalDate.parse(scanner.next());
        LocalDate ld2 = LocalDate.parse(scanner.next());
        LocalDate ld3 = LocalDate.parse(scanner.next());

        boolean isBetween = ld1.isAfter(ld2) && ld1.isBefore(ld3) || ld1.isAfter(ld3) && ld1.isBefore(ld2);
        System.out.println(isBetween);
    }
}
