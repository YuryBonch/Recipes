class Patient {

    String name;

    // write your method here
    public void say() {
        String str = "Hello, my name is %s, I need a doctor.";
        System.out.printf(str, this.name);
    }
}