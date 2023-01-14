package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*Sample Input

STDIN           Function
-----           --------
6               arr[] size n = 6
-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]

Sample Output

0.500000
0.333333
0.166667

Explanation

There are
positive numbers, negative numbers, and zero in the array.
The proportions of occurrence are positive: , negative: and zeros: . */

class Result {

    public static void plusMinus(List<Integer> arr) {
        float x=0f;
        float y=0f;
        float z=0f;
        
        for(Integer a: arr){
            if(a == 0) x++;
            else if(a>0) y++;
            else if(a<0) z++;
        }
        System.out.printf("%.6f \n", y/arr.size());
        System.out.printf("%.6f \n", z/arr.size());
        System.out.printf("%.6f", x/arr.size());
        
    }
	

}


public class PlusMinus {	
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> arr = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrTemp[i]);
	            arr.add(arrItem);
	        }

	        Result.plusMinus(arr);

	        bufferedReader.close();
	    

	    }
}
