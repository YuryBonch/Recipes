// do not remove imports
import java.util.*;
import java.util.function.Function;

class ArrayUtils {
    // define invert method here
    public static <E> E[] invert(E[] in) {
        Collections.reverse(Arrays.asList(in));
        return in;
    }
}