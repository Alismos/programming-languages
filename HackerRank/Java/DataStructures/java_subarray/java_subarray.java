import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] arr = new int[length];

        int first = scan.nextInt();
        arr[0] = first;
        int counter = first < 0 ? 1 : 0;

        for (int i = 1; i < length; i++){
            int num = scan.nextInt();
            arr[i] = arr[i - 1] + num;

            if (arr[i] < 0){
                counter++;
            }

            for (int j = 0; j < i; j++){
                int sum_groups = arr[i] - arr[j];
                if (sum_groups < 0){
                    counter++;
                }
            }
        }
        
       System.out.print(counter);
    }
}