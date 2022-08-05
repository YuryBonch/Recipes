import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDate dt = LocalDate.parse(scanner.nextLine());


        System.out.println(dt.minusYears(30));
        System.out.println(dt.plusYears(30));

    }
}