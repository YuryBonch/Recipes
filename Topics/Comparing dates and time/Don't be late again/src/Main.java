import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        final LocalTime timeCheck = LocalTime.of(20,0); // 19:30 + 30 = 20:00

        while (scanner.hasNext()) {
            String name = scanner.next();
            LocalTime ld1 = LocalTime.parse(scanner.next());
            if (ld1.compareTo(timeCheck) > 0) { 
                System.out.println(name); 
            }
        }


    }
}
