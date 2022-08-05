import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        LocalTime lt = LocalTime.parse(time);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        lt = lt.minusMinutes(m);
        lt = lt.minusHours(h);
        System.out.println(lt.withSecond(0));
    }
}