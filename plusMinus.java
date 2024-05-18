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
    public static void plusMinus(List<Integer> arr) {
        int positive=0;
        int negative=0;
        int zero = 0;
        int totalEle = arr.size();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>0) positive++;
             else if(arr.get(i)<0) negative++;
              else zero++;
            
        }
        double ratioPositive = positive/(1.0*totalEle);
        double ratioNegative = negative/(1.0*totalEle);
        double ratioZero = zero/(1.0*totalEle);
        
        System.out.println(String.format("%.6f", ratioPositive));
        System.out.println(String.format("%.6f",ratioNegative));
        System.out.println(String.format("%.6f",ratioZero));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
