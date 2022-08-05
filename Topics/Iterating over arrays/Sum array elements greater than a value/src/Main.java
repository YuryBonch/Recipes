import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        int[] arr = new int[cnt];


        for (int i = 0; i < cnt; i ++) {
            String s = scanner.next();
            arr[i] = Integer.parseInt(s);
        } // put your code here

        int sum = 0;
        int val = scanner.nextInt();
        for (int dig: arr) {
            if (dig > val) sum += dig;
        }

        System.out.println(sum);
    }
}