class NumbersThread extends Thread {
    public int from;
    public static int to;

    public NumbersThread(int from, int to) {
        // implement the constructor
        this.from = from;
        this.to = to;

    }

    // you should override some method here
    @Override
    public void run() {
        for (int i=from; i<= to; i++) {
            System.out.println(i);
        }
    }
}