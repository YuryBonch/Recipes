import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String ip = scanner.nextLine();
        String dg = "(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])";
        String regex_ip = String.format("%s\\.%s\\.%s\\.%s", dg, dg, dg, dg);
        System.out.println(ip.matches(regex_ip) ? "YES" : "NO");
    }
}