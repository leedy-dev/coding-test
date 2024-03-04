package backjoon.step.Advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class T_1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;

        Set<Character> set;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            set = new HashSet<>();

            char[] chars = str.toCharArray();

            for (int j = 0; j < chars.length; j++) {
                char c = chars[j];

                if (j < chars.length-1 && c == chars[j+1]) continue;

                if (set.contains(c)) {
                    count--;
                    break;
                }
                else set.add(c);
            }
        }

        System.out.println(N + count);

        br.close();
    }

}
