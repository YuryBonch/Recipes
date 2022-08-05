import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int len = str.length();
        if (len >= 2)
            System.out.println(str.substring(len-2, len-1));
        else
            System.out.println(0);
    }
}