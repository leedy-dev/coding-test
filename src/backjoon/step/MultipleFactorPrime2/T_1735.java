package backjoon.step.MultipleFactorPrime2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_1735 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int b1 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        br.close();

        int c1 = a1 * b2 + b1 * a2;
        int c2 = a2 * b2;

        int gcd = gcd(c1, c2);

        sb.append(c1 / gcd).append(" ").append(c2 / gcd);

        System.out.println(sb);
    }

    static int gcd(int a, int b) {
        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

}
