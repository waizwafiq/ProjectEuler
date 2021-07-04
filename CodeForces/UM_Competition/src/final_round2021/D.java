package final_round2021;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(reader.readLine());

        Set<String> set = new HashSet<>();
        int total = 0;

        for(int i = 0; i < testCase ; i++){
            String str = reader.readLine();
            str = str.toLowerCase();

            if(!set.contains(str)){
                total += str.length();
                set.add(str);
            }
        }
        System.out.println(total);
    }
}
