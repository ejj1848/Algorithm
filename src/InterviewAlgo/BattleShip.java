package InterviewAlgo;

import java.util.HashSet;
import java.util.Set;

public class BattleShip {

    public static void main(String[] args) {
        BattleShip bs = new BattleShip();
        System.out.println(bs.solution(4, "1B 2C,2D 4D", "2B 2D 3D 4D 4A"));

    }

    public String solution(int N, String S, String T) {
        // write your code in Java SE 8
        int partial = 0;
        int sunk = 0;

        String[] shotsFired = T.split(" ");
        String[] battleShips = S.split(",");

        for(String ship : battleShips) {
            // build set of battleShips coordinates
            Set<String> shipCoordinates = new HashSet<String>();
            String[] position= ship.split(" ");
            int startingX = Integer.parseInt(position[0].replaceAll("[A-Z]",""));
            char startingY = position[0].replaceAll("[0-9]","").charAt(0);
            int endingX = Integer.parseInt(position[1].replaceAll("[A-Z]",""));
            char endingY = position[1].replaceAll("[0-9]","").charAt(0);

            for(int i = startingX; i <= endingX; i++) {
                for(char j = startingY; j <= endingY; j++) {
                    String s = String.valueOf(i) +j;

                    shipCoordinates.add(s);

                }

            }

            // store num of coordinates from size of set (shipSize)
            int shipSize = shipCoordinates.size();

            // iterate over shotsFired, removing from set
            for(String shot : shotsFired) {
                if(shipCoordinates.contains(shot)) {
                    shipCoordinates.remove(shot);
                }
            }
            // if set size is 0 increment 'sunk'
            if (shipCoordinates.isEmpty())
                sunk++;




                // else if set size is less than 'shipSize' increment 'partial'
            else if(shipCoordinates.size() < shipSize)
                partial++;
        }


        return sunk + "," + partial;

    }
}
