package HackerRankAlgos;

/**
 * Created by Eric.Johnson on 5/25/2017.
 */
public class Stdinsasss {

    public static void main(String[] args) {


        String parseThis = " 1,4,2,6,2,7,2,8,9,10,100,2,6,2";

        String noTwo = parseThis.replaceAll("2,","");
        String foobar = noTwo.replaceAll(",2","");
        String end = foobar.replaceAll(",", " ");


        System.out.println(end);
    }

}
