import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int d3 = scanner.nextInt();

        boolean b1 = ((d3 % d1) == 0);
        boolean b2 = ((d3 % d2) == 0);
        boolean b3 = (d3 > d1*d2);
        if  (!(b1 || b2) || b3)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}