import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hbus = scanner.nextInt();
        int nbridg = scanner.nextInt();
        boolean result = false;
        int i = 1;

        for (i = 1 ; i <= nbridg; i++) {
            int h = scanner.nextInt();
            result = (hbus >= h);
            if (result) break;
        }

        if (!result) System.out.println("Will not crash");
        else System.out.println("Will crash on bridge " + i);
    }
}
