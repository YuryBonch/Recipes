import java.util.Objects;

class Predicate {
    public static final TernaryIntPredicate ALL_DIFFERENT = (a, b, c) -> (a!=b) & (a!=c) & (b!=c); // Write a lambda expression here


    @FunctionalInterface
    public interface TernaryIntPredicate {
        // Write a method here
        boolean test(int i1, int i2, int i3);
    }
}