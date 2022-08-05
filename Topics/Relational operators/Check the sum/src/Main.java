import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int v3 = scanner.nextInt();

        boolean s1 = ((v1 + v2) == 20);
        boolean s2 = ((v1 + v3) == 20);
        boolean s3 = ((v3 + v2) == 20);



        System.out.println(s1 || s2 || s3);
    }
}