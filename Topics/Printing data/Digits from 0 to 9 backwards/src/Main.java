class Main {
    public static void main(String[] args) {
        // put your code here
        String line = "0 1 2 3 4 5 6 7 8 9";
        String[] str = line.split(" ");
        int len = str.length - 1;

        for (int i = 0; i <= len; i++)
            System.out.print(str[len-i] + " ");
    }
}