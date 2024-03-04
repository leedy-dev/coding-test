package backjoon.step.Advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class T_1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();

        Map<Character, Integer> map = new HashMap<>();

        Character res = null;
        int max = 0;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            int v = map.getOrDefault(c, 0) + 1;

            map.put(c, v);

            if (v > max) {
                res = c;
                max = v;
                count = 1;
            }
            else if(v == max) {
                count++;
            }
        }

        System.out.println(count > 1 ? "?" : res);

        br.close();
    }

}
