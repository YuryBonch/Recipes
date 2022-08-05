import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();

        if (d1 < 1) {
            System.out.println("no army");
        } else if (d1 < 20) {
            System.out.println("pack");
        } else if (d1 < 250) {
            System.out.println("throng");
        } else if (d1 < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}