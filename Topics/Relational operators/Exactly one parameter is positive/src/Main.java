import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int d3 = scanner.nextInt();

        boolean v1 = (d1 > 0) && (d2 <= 0 && d3 <= 0);
        boolean v2 = (d2 > 0) && (d1 <= 0 && d3 <= 0);
        boolean v3 = (d3 > 0) && (d2 <= 0 && d1 <= 0);

        System.out.println(v1 || v2 || v3);
    }
}