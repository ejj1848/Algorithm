package Google;


import java.util.*;

/**
 * Created by Eric.Johnson on 5/30/2017.
 */
public class Sheep {


        public static void main(String[] args) {


            Scanner in = new Scanner(System.in);

                int n = in.nextInt();
                if (n == 0) {
                    System.out.println("Insomnia");
                    return;
                }
                HashSet<Integer> numberSeen = new HashSet<>();
                int current = n;
                while (true) {
                    int m = current;
                    while (m > 0) {
                        numberSeen.add(m%10);
                        m /= 10;
                    }
                    boolean ok = true;
                    for (int i = 0; i <= 9; i++) {
                        if (!numberSeen.contains(i)) {
                            ok = false;
                        }
                    }
                    if (ok)
                        break;
                    current += n;
                }

                System.out.println(current);
            }


}


