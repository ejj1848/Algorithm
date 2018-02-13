package CrackingCode;

public class IsUnique {

    final static String  input = "aabcda";

    public static void main(String[] args) {

        boolean isUniqueString = true;

        breakloop:
        for(int i = 0; i <= input.length(); i++){
            for (int j = i + 1 ; j < input.length() ; j++) {
                System.out.println("COMPARING: " + input.charAt(i) + " == " + input.charAt(j));

                if(input.charAt(i) == input.charAt(j)){
                    isUniqueString = false;
                    break breakloop;
                }
            }
        }
        System.out.println(isUniqueString);
    }
}
