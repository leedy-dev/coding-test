package backjoon.step.Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_2745 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int length = N.length();
        int B = Integer.parseInt(st.nextToken());

        long result = 0;

        for (int i = 0; i < length; i++) {
            result += Math.pow(B, length-i-1) * getNumber(N.charAt(i));
        }

        System.out.println(result);

        br.close();
    }

    public static int getNumber(char c) {
        return c >= 'A' ? c - 'A' + 10 : c - '0';
    }

}
