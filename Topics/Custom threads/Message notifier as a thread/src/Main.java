class MessageNotifier extends Thread {

    // write fields to store variables here
    public String msg;
    public int repeats;

    public MessageNotifier(String msg, int repeats) {
        // implement the constructor
        super();
        this.msg = msg;
        this.repeats = repeats;
    }

    @Override
    public void run() {
        // implement the method to print the message stored in a field
        for (int i = 0; i < repeats; i++) {
            System.out.println(msg);
        }
    }
}