package InterviewAlgo;

public class SumPossible {

    // Given a string input  find all the pairs that can make the sum, in the given string
    // sum =  ";#"
    // "0,1,2,3,4;5"  =  2,3 : 1,4
    // output should be #+# , #+#
    // If no matches present,  return "Not Possible"

    private static String input = "0,1,2,3,4;100";

    public static void main(String[] args) {


        String total = input.substring(input.lastIndexOf(';') + 1);
        int sum = Integer.parseInt(total);
        input = input.substring(0, input.lastIndexOf(";"));
        System.out.println(sum);
        System.out.println(input);

        String[] splitNums = input.split(",");
        String output = "";
        for (int i = 0; i < splitNums.length; i++) {
            for (int j = i + 1; j < splitNums.length; j++) {

                if (Integer.parseInt(splitNums[i]) + Integer.parseInt(splitNums[j]) == sum) {

                    output += splitNums[i] + "+" + splitNums[j] + " , ";
                }
            }
        }

        if (output.length() < 1) {
            System.out.println("Not Possible");
        } else {
            System.out.println("Result Set: " + output.substring(0, output.lastIndexOf(',')));
        }
    }
}
