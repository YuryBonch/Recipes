import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int days = scanner.nextInt();

        LocalDate ld = LocalDate.ofYearDay(year, days);
        System.out.println(ld.getMonthValue() != ld.plusDays(1).getMonthValue());

    }
}