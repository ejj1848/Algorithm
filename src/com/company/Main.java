package com.company;

import java.util.*;
import java.util.regex.Pattern;


public class Main{

    public static void main(String[] args) {



    }

    public static void piglatin() {
        System.out.println("Enter words");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Pattern remove = Pattern.compile("[^\\w\\s]");

        String newString = remove.matcher(s).replaceAll("");
        String[] splitted = newString.split("\\s+");
        List<String> newWords = new ArrayList<>();
        for (String word : splitted) {
            String finalString = wordCreator(word);
            newWords.add(finalString);
        }
        String finalString = "";
        for (String word : newWords) {
            System.out.print(word);
            System.out.print("");
        }
        //System.out.print(finalString);

    }

    public static String wordCreator(String s) {
        char[] charArray = s.toCharArray();
        char[] myWord = new char[charArray.length + 3];
        //List<Character> chars = new ArrayList<>();
        if (charArray[0] == 'a' || charArray[0] == 'e' || charArray[0] == 'i' ||
                charArray[0] == 'o' || charArray[0] == 'u') {

            for (int i = 0; i < charArray.length; i++) {
                myWord[i] = charArray[i];
            }
            myWord[charArray.length] = 'w';
            myWord[charArray.length + 1] = 'a';
            myWord[charArray.length + 2] = 'y';
        } else {
            int firstVowel = 0;
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' ||
                        charArray[i] == 'o' || charArray[i] == 'u') {
                    firstVowel = i;
                    break;
                }
            }
            int counter = 0;
            for (int i = firstVowel; i < charArray.length; i++) {
                myWord[counter] = charArray[i];
                counter += 1;

            }

            for (int i = 0; i < firstVowel; i++) {
                myWord[counter] = charArray[i];
                counter += 1;
            }
            myWord[charArray.length] = 'a';
            myWord[charArray.length + 1] = 'y';

        }
        return new String(myWord);
    }
}

//    private static int CreateMenu() {
//        /*
//            Team: Charles Knows What is Best in Life
//            Members: CharlesCodes, Gabriel
//
//         */
//
//        //  Displays a menu and uses a scanner to get user input to perform the actions for the menus
//        int menu = -1;
//        int userChoice;
//        System.out.println("Welcome back Developers to Minesweeper Text Adventure!");
//        while (menu < 0) {
//            System.out.println("===============================================");
//            System.out.println("|| Please Select an Option Below To Continue ||");
//            System.out.println("|| Easy [8][8]-------------------> (ENTER 1) ||");
//            System.out.println("|| Medium [12][12]---------------> (ENTER 2) ||");
//            System.out.println("|| Hardcore [16][16]-------------> (ENTER 3) ||");
//            System.out.println("|| RULES ------------------------> (ENTER 4) ||");
//            System.out.println("===============================================");
//            Scanner scan = new Scanner(System.in);
//            userChoice = scan.nextInt();
//            if (userChoice == 1) {
//                return 8;
//            } else if (userChoice == 2) {
//                return 12;
//            } else if (userChoice == 3) {
//                return 16;
//            } else if (userChoice == 4) {
//                System.out.println("The purpose of the game is to open all the cells of the board which do not contain a bomb. You lose if you set off a bomb cell.\n" +
//                        "\n" +
//                        "Every non-bomb cell you open will tell you the total number of bombs in the eight neighboring cells. Once you are sure that a cell contains a bomb, you can a flag it on it as a reminder.\n" +
//                        "\n" +
//                        "Happy mine hunting!");
//            } else if (userChoice > 4 || userChoice <= 0) {
//                System.out.println("Please enter a valid number");
//            } else
//                System.out.println("Please enter a valid number");
//        }
//        return 0;
//    }
//
//    private static char[][] CreateBoard() {
//        //  This incredibly important function is the linchpin of the entire minesweeper architecture.
//        //  Without it there would be no place for anyone to put any mines!
//
//        //  Generate the Board
//        int x = CreateMenu();
//        char[][] board = new char[x][x];
//
//        //  Populate the Board with spaces for display purposes
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                board[i][j] = ' ';
//            }
//        }
//
//        return board;
//    }
//
//    private static char[][] PrintBoard(char[][] board) {
//        //  This displays the board 2d character array to the console with some spacers.
//
//        //  Basic looping logic to display a square array.
//        for (int i = 0; i < board.length; i++) {
//            if (i == 0) {
//                System.out.print("[xy]"); // The top left corner
//                for (int j = 0; j < board.length; j++) {
//                    System.out.print("[" + String.valueOf((char) (j + 65)) + "]"); // The x-axis labels
//                }
//                System.out.print("\n");
//            }
//            for (int j = 0; j < board.length; j++) {
//                if (j == 0) {
//                    if (i < 10) {
//                        System.out.print("[ " + i + "]" + "[" + board[i][j] + "]"); // The y-axis labels and Position 0 if y less then 10
//                    } else {
//                        System.out.print("[" + i + "]" + "[" + board[i][j] + "]"); // The y-axis labels and Position 0
//                    }
//                } else {
//                    System.out.print("[" + board[i][j] + "]");
//                }
//            }
//            System.out.print("\n");
//        } return null;
//    }
//     /*GENERATAN MIENS
//    MEFFID WROTE GUD BY ROB
//    NIK HELPD
//    */
//        public static char[][] generateMines(char[][] grid) {
//            char[][]gridout = grid;
//            int mines =0;
//            //set a counter!
//            int counter = 0;
//            //check the length of the grid and generate a number of mines accordingly
//            if (grid.length == 8) {
//                mines = randomWithRange(8, 10);
//            } else if (grid.length == 12) {
//                mines = randomWithRange(13, 15);
//            } else if (grid.length == 16) {
//                mines = randomWithRange(18, 20);
//            }
//
//            //while the counter is fewer than the number of mines deployed
//            while(counter < mines) {
//                //iterate thru grid(i)
//                for (int i = 0; i < grid.length; ++i) {
//                    //iterate thru grid(j)
//                    for (int j = 0; j < grid[i].length; ++j) {
//                        //call our random ranged method to roll a number
//                        int setter = randomWithRange(0, 10);
//                        //if that number is 1, we set ourselves a mine!
//                        if (setter == 1) {
//                            //this is where we set the mine
//                            grid[i][j] = '*';
//                            //check if the counter is equal to the number of mines so we can break out if necessary
//                            //(and stop planting mines
//                            if (counter == mines) {
//                                break;
//                                //otherwise, we're just going to increment the counter and keep planting mines!
//                                //mines!
//                            } else {
//                                counter++;
//                                //MINES!!!
//                            }
//                        }
//                    }
//                }
//            }
//
//            return gridout;
//        }
//
//        //this is another method. please don't eat.
//    static int randomWithRange(int min, int max)
//    {
//        int range = (max - min) + 1;
//        return (int)(Math.random() * range-1) + min;
//    }
//
//    /**
//     * Created by   Andy Kieser
//     *              Brendan Rooney
//     *              8/16/2016.
//     */
//
//    //Generates the values of each location
//    public static char[][] GenerateBoard(char[][] mineLocations){
//        //placeholder for value to be stored at mineLocation[row][col]
//        char currentChar;
//        //iterates through each position in board
//        for(int row = 0; row < mineLocations.length; ++row){
//            for(int col = 0; col < mineLocations[row].length; ++col){
//                //if current location is a mine it stays the same
//                if(mineLocations[row][col] != '*') {
//
//                    currentChar = CheckNeighbors(mineLocations, row, col);
//                    mineLocations[row][col] = currentChar;
//                }
//            }
//        } return mineLocations;
//    }
//
//    //checks the neighbors for mines, returns number of mines surrounding it
//    public static char CheckNeighbors(char[][] mineLocations, int row, int col){
//        //placeholder for number of mines around current location
//        int i=0;
//        /*
//        * iterates around current location increments i if mine is found
//        * */
//        for(int startRow = row-1; startRow <= row + 1; startRow++){
//            for(int startCol = col-1; startCol <= col + 1; startCol++){
//                //checks if neighbor position is in bounds and contains a mine!
//                if(isInBounds(startRow,startCol,mineLocations)&&mineLocations[startRow][startCol]=='*'){
//                    i++;
//                }
//            }
//        }
//        //return number of mines as char!
//        return Integer.toString(i).charAt(0);
//    }
//
//
//    //checks if neighbor Location is in bounds of array
//    public static boolean isInBounds(int row, int col,char[][] mineLocations){
//        if(row < 0 || row >= mineLocations.length)
//            return false;
//        if(col < 0||col >= mineLocations[row].length)
//            return false;
//        return true;
//    }




