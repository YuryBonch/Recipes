import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        // write your code here
        int year = Integer.max(dateTime1.getYear(), dateTime2.getYear());
        int mon = Integer.max(dateTime1.getMonthValue(), dateTime2.getMonthValue());
        int day = Integer.max(dateTime1.getDayOfMonth(), dateTime2.getDayOfMonth());

        int h = Integer.max(dateTime1.getHour(), dateTime2.getHour());
        int m = Integer.max(dateTime1.getMinute(), dateTime2.getMinute());
        int s = Integer.max(dateTime1.getSecond(), dateTime2.getSecond());

        return  LocalDateTime.of(year, mon, day, h, m, s);

    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));
    }
}