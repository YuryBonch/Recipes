import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method

        int countA = Collections.frequency(list1, elem);
        int countB = Collections.frequency(list2, elem);
        return countA == countB;
    }
}