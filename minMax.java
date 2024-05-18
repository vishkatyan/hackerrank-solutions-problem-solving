import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*; 
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static void miniMaxSum(List<Integer> arr) {
    long total =0;
    
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    
    for(int i=0; i<arr.size();i++){
        total +=arr.get(i); 
        if(arr.get(i)<min) min = arr.get(i);
        if(arr.get(i)>max) max = arr.get(i);
    }
    // To find Min -> we need to find the max element in the list
    long minSum = total - max;
    long maxSum = total - min;
    
    System.out.println(minSum+" "+maxSum);
   

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
