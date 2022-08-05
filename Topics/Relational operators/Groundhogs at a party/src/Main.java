import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value

        int d1 = scanner.nextInt();
        boolean we = scanner.nextBoolean();

        boolean w1 =  (we && d1 >= 15 && d1 <= 25);
        boolean w2 =  (!we && d1 >= 10 && d1 <= 20);
        System.out.println(w1 || w2 );
    }
}