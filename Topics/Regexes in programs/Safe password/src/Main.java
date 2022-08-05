import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String pass = scanner.nextLine();
        String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{12,}";
        System.out.println(pass.matches(regex) ? "YES" : "NO");

    }
}