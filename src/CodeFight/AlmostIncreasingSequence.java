package CodeFight;

public class AlmostIncreasingSequence {

    public static void main(String[] args) {
        int[] sequence = {1, 3, 2};
        System.out.println(aIS(sequence));
    }

    private static boolean aIS(int[] sequence) {
        boolean flag = true;
        int seq1 = 0;
        int seq2 = 0;

        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] >= sequence[i + 1]) seq1++;
        }
        for (int j = 0; j < sequence.length - 2; j++) {
            if (sequence[j] >= sequence[j + 2]) seq2++;
        }
        if (seq1 + seq2 > 2) {
            flag = false;
        }

        return flag;
    }
}
