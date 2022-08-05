import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        String out = "";
        int cnt = 0;

        ///System.out.println(s2-s1);

        for (int i = s1; i <= s2; i++) {
            boolean b1 = (i % 3 == 0);
            boolean b2 = (i % 5 == 0);
            boolean b3 = (i % 3 == 0) && (i % 5 == 0);

            out = Integer.toString(i);
            if (b3) out = "FizzBuzz";
            else if (b1) out = "Fizz";
            else if (b2) out = "Buzz";

            System.out.println(out);

        }


    }
}