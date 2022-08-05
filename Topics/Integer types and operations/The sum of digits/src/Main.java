import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();

        int d1 = val / 100; // 534 > 5
        int d3 = val % 100; // 534 > 34
        int d2 = d3 / 10;   // 34 > 3
        d3 = d3 % 10;       // 34 > 4

        System.out.println(d1 + d2 + d3);
    }
}