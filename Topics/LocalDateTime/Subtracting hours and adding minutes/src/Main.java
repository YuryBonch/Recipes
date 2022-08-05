import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime ldt = LocalDateTime.parse(scanner.nextLine());
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(ldt.minusHours(h).plusMinutes(m));
    }
}