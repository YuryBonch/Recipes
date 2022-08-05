import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();
        int d2 = d1 % 2;
        if (d2 == 0)
        d1 += 2;
        else d1 += 1;
        System.out.println(d1);
    }
}