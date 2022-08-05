import java.util.function.*;

class FunctionUtils {

    public static int id = 0;
    public static Supplier<Integer> getInfiniteRange() {
        // write your code here
        Supplier<Integer> cls = new Supplier<Integer>() {
            Integer id = 0;
            @Override
            public Integer get() {
                return id++;
            }
        };

        return cls;
    }


}