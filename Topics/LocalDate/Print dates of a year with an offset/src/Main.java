import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        LocalDate ld = LocalDate.parse(date);
        int offset = scanner.nextInt();
        int year = ld.getYear();

        do  {
            System.out.println(ld);
            ld = ld.plusDays(offset);
        } while(ld.getYear() == year);
    }
}