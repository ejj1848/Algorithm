package Google;

public class digits {

    public static void main(String[] args) {

        final String[] numbers = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        String entry = "OURNEONFOE";
        StringBuilder phoneNumber = new StringBuilder();

        // Go through each number in array
        for (int j = 0; j < numbers.length; j++) {
            //array is 0 based, so this works
            String number = numbers[j];
            StringBuilder temp = new StringBuilder(entry);
            boolean isInArray = true;

            // For any repeated numbers
            while (isInArray) {
                for (int k = 0; k < number.length(); k++) {

                    if (isInArray) {
                        String character = Character.toString(number.charAt(k));
                        // Check if the current word contains this letter from the current number
                        if (temp.toString().contains(character)) {
                            // Yes, then remove that letter
                            temp.deleteCharAt(temp.indexOf(character));

                        } else {
                            // This number does not exist in the word
                            isInArray = false;
                        }

                    }
                }

                if (isInArray) {
                    phoneNumber.append(j);
                }
            }
            System.out.println(phoneNumber);
        }
    }

}
