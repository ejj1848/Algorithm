package HackerRankAlgos;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Bships {

    public static class Battleship {



        private static class PlayBoard {
            public List<Ship> ships;

            public PlayBoard(String shipLocations, String shots) {
                setShips(shipLocations);
                fireShots(shots);
            }

            private void setShips(String shipLocations) {
                List<String> shipStarts = Arrays.asList(shipLocations.split(","));
                ships = shipStarts.stream().map(Ship::new).collect(Collectors.toList());
            }

            public PlayBoard fireShots(String shots) {
                ships = ships.stream().map(ship -> ship.checkHit(shots)).collect(Collectors.toList());

                return this;
            }

            public String countHitsAndSunk() {
                int hit = 0;
                int sunk = 0;

                for(Ship ship : ships) {
                    if(ship.isSunk()) { sunk++; }
                    else if(ship.isHit()) { hit++; }
                }

                return sunk + "," + hit;
            }
        }



        private static class Tile {
            public String column;
            public Integer row;
            public boolean hit = false;

            public Tile(String column, Integer row) {
                this.column = column;
                this.row = row;
            }

            public Tile toggleHit() {
                hit = true;
                return this;
            }

        }


        private static class Ship {
            public Map<String, Tile> dimensions = new HashMap<>();

            public Ship(String positions) {
                String[] positionArr = positions.split(" ");
                Set<String> columns = new HashSet<>();

                List<String[]> individuals = Stream.of(positionArr)
                        .map(position -> position.split(""))
                        .collect(Collectors.toCollection(LinkedList::new));

                for(String[] s : individuals) {
                    columns.add(s[1]);
                }

                if(columns.size() == 1) {
                    IntStream.range(Integer.parseInt(individuals.get(0)[0]), Integer.parseInt(individuals.get(1)[0])+1)
                            .boxed()
                            .forEach(i -> {
                                dimensions.put(i + individuals.get(0)[1], new Tile(individuals.get(0)[1], i));
                            });
                } else {
                    String[] first = individuals.get(0);
                    String[] last = individuals.get(1);
                    dimensions.put(Integer.parseInt(first[0]) + first[1], new Tile(first[1], Integer.parseInt(first[0])));
                    dimensions.put(Integer.parseInt(last[0]) + last[1], new Tile(first[1], Integer.parseInt(last[0])));
                    dimensions.put(Integer.parseInt(first[0]) + first[1], new Tile(last[1], Integer.parseInt(first[0])));
                    dimensions.put(Integer.parseInt(last[0]) + last[1], new Tile(last[1], Integer.parseInt(last[0])));
                }
            }

            public Ship checkHit(String shots) {
                for(String shot : shots.split(" ")) {
                    if(dimensions.keySet().contains(shot)) {
                        dimensions.put(shot, dimensions.get(shot).toggleHit());
                    }
                }

                return this;
            }

            public boolean isSunk() {
                boolean sunk = true;

                for(Tile tile : dimensions.values()) {
                    sunk = sunk && tile.hit;
                }

                return sunk;
            }

            public boolean isHit() {
                boolean hit = true;

                for(Tile tile : dimensions.values()) {
                    hit = hit || tile.hit;
                }

                return hit;
            }
        }

        public static void main(String[] args) {
            PlayBoard playBoard = new PlayBoard("1A 1B,2C 2C", "1B");

            System.out.println(playBoard.countHitsAndSunk());
        }
    }
}
