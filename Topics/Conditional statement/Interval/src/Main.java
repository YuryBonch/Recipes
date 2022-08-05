import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();

        if (((d1 > -15) && (d1 <= 12)) || ((d1 > 14) && (d1 < 17)) || (d1 >= 19))
                System.out.println("True");
        else
                System.out.println("False");
    }
}