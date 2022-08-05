import java.text.Format;
import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime ldt = LocalDateTime.parse(scanner.nextLine());
        long minute = scanner.nextLong();

        ldt = ldt.plusMinutes(minute);

        System.out.println(String.format("%d %d %s", ldt.getYear(), ldt.getDayOfYear(), ldt.toLocalTime()));
    }
}