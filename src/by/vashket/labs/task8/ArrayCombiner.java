package by.vashket.labs.task8;

import java.util.ArrayList;
import java.util.List;

public class ArrayCombiner {

    public static void makeTest() {
        List<Integer> a = List.of(1, 3, 5, 7, 11, 13, 17, 19);
        ArrayList<Integer> aSeq = new ArrayList<>(a);
        List<Integer> b = List.of(0, 2, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20);
        ArrayList<Integer> bSeq = new ArrayList<>(b);
        System.out.println(combineArray(aSeq, bSeq));
    }

    private static List<Integer> combineArray(List<Integer> aSeq, List<Integer> bSeq) {
        List<Integer> result = new ArrayList<Integer>();
        int i = 0, j = 0;
        while (i<aSeq.size())
        {
            if (aSeq.get(i) > bSeq.get(j))
            {
                result.add(i);
            } else {
                result.add(++i);
            }
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        makeTest();
    }
}
