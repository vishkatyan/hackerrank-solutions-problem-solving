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

    public static String timeConversion(String s) {
    String start = s.substring(0, 2);
    // String format = s.substring(8);
    String end = s.substring(2,8);
    int hour = Integer.parseInt(start);
    
    if(s.contains("P") && hour!= 12){
        hour+=12;
        start = String.valueOf(hour);
    }
    
    else if(s.contains("A") && hour== 12){
        start ="00";
        
    } 
    // remove last two string value and return string s
    s = start +end;
    return s;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
