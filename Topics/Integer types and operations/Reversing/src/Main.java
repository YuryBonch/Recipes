import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String d1 = scanner.nextLine();
        String d2 = new StringBuilder(d1).reverse().toString();
        int i = Integer.parseInt(d2);
        System.out.println(i);
    }
}