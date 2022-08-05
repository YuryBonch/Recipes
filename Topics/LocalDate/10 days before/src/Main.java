import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDate ld = LocalDate.parse(scanner.nextLine());
        
        System.out.println(ld.minusDays(10));
    }
}