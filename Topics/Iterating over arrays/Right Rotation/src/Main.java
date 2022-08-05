import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int[] arr = Arrays.stream(scanner.nextLine().split(" "))
        //        .mapToInt(Integer::parseInt)
        //        .toArray();

        String[] arr = scanner.nextLine().split(" ");


        int cnt = scanner.nextInt();
        cnt = cnt % arr.length;


        for (int i = 1; i <= cnt; i++) {

            String last = arr[arr.length - 1];
            int j = 0;
            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
                ///System.out.println("j = " + j);
            }
            arr[j] = last;
        }

        // System.out.println(Arrays.toString(array));
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }



        //System.out.println(Arrays.toString(array));

        // int first = offset % args.length;
        // int[] aout = new int[args.length];
        // for (int i = 0; i < args.length; i++) {
        //    int j = first
        //    aout[i] = array[j];
        // }
    }
}