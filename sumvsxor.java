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

public class Solution {

    // Complete the sumXor function below.
    static long sumXor(long n) {
        long count = 0;
        while(n>0){
            if(n%2==0) count++;
            n/=2;
        }
        return (long) Math.pow(2,count);
    }
    
    //Solusi Brute Force yang akan menyebabkan time limit exceeded
    static long sumXor(long n) {
        long count = 0;
        for(int i=0;i<n;i++){
            if((n+i)==(n^i)) count++;
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = sumXor(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
