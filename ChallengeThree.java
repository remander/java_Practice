import java.util.*;
import java.io.*;

public class ChallengeThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            System.out.println(calculate(a, b, n)); 
        }
        in.close();

    }

    public static String calculate (int a, int b, int n) {
        String result = ""; 
        int term = a; 
        for (int i = 0; i < n; i++)
        {
            term += Math.pow(2, i) * b; 
            result += term + " "; 
        }

        return result; 



    }
}
