// do not remove imports
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    // define getFirst method here
    public static <E> E getFirst(E[] arr) {
        if (arr.length == 0) return null;
        return arr[0];

    }
}