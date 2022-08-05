import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        String[] arr = new String[cnt];

        for (int i = 0; i < cnt; i ++) {
            arr[i] = scanner.next();
        }
        String last = arr[arr.length - 1];
        int j = 0;
        for (j = arr.length - 1; j > 0; j--) {
            arr[j] = arr[j - 1];
            ///System.out.println("j = " + j);
        }
        arr[j] = last;

        for (j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}