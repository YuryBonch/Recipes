import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int cA = 0;
        int cB = 0;
        int cC = 0;
        int cD = 0;
        int cnt = scanner.nextInt();
        for (int i = 0; i < cnt; i++) {
            String str = scanner.next();
            switch (str) {
                case "A":
                    cA++;
                    break;
                case "B":
                    cB++;
                    break;
                case "C":
                    cC++;
                    break;
                case "D":
                    cD++;
                    break;
            }
        }

        System.out.printf("%d %d %d %d", cD, cC, cB, cA);

    }
}