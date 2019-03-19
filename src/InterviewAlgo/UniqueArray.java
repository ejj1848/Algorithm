package InterviewAlgo;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueArray {



    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = {1,4,4,5,6,7};

        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listB.removeAll(listA);
        Set<Integer> set = new HashSet<>(listB);
        System.out.println(set);


    }
}
