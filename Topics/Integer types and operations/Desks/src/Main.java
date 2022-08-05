import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int d3 = scanner.nextInt();


        int j = d1 % 2;
        d1 = d1 / 2 + j;

        j = d2 % 2;
        d2 = d2 / 2 + j;

        j = d3 % 2;
        d3 = d3 / 2 + j;

        System.out.println(d1 + d2 + d3);
    }
}