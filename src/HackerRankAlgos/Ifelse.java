package HackerRankAlgos;

import java.util.Scanner;

/**
 * Created by ericjohn1 on 12/20/2016.
 */
public class Ifelse {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String ans;
    if(n%2==1)

    {
        ans = "Weird";
    }
    else if(n % 2 ==0 && n<=5 && n>=2){
        ans = "Not Weird";
    }
    else if(n %2 == 0 && n>=6 && n<=20){
        ans = "Weird";
    }
    else if (n % 2 == 0 && n > 20){
        ans ="Not Weird";
    }

    else

    {
        ans = "Not Weird";

    }
        System.out.println(ans);
    }
}
