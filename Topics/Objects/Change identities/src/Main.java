class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        // write your code here
        String s = p1.name;
        int a = p1.age;
        p1.name = p2.name;
        p1.age = p2.age;
        p2.name = s;
        p2.age = a;
    }
}