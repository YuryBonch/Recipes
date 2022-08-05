import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        int len = 0;

        while (!flag) {
            if (scanner.hasNext()) {
                int v1 = scanner.nextInt();
                if (v1 > 0) len++;
                else flag = (v1 == 0);
            }
        }
        System.out.println(len);
        }
}