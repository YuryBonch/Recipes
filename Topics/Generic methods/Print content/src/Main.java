// do not remove imports
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    // define info method here
    public static <E> String info(E[] in) {
        //String[] out = new String[]{};

        //out = Arrays.stream(in).toArray().toString();
        return Arrays.toString(in);
    }
}