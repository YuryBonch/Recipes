import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int val = scanner.nextInt();
        if (val > 0 && val < 1000000) {

            System.out.print(val + " ");
            while (val != 1) {

                if (val % 2 == 0) {
                    val = val / 2;
                } else {
                    val = val * 3 + 1;
                }

                System.out.print(val + " ");
            }

        }
        else
            System.out.println("Error: " + val);
    }
}