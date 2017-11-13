package InterviewAlgo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * Created by Eric.Johnson on 6/19/2017.
 */
public class AdamSet {

    public static void main(String[] args) {

        // find all distinct values in set 1 that arent in set B

        Set<Integer> aSet = new HashSet<>();
        aSet.add(1);
        aSet.add(2);
        aSet.add(3);


        Set<Integer> bSet = new HashSet<>();
        bSet.add(1);
        bSet.add(3);
        bSet.add(7);

//        aSet.removeAll(bSet);
//
//        System.out.println(aSet);

        List<Integer> uniqueList= aSet.stream()
                .filter(a -> !bSet.contains(a))
                .collect(Collectors.toList());

        System.out.println(uniqueList);
    }

}
