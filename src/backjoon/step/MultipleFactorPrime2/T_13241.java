package backjoon.step.MultipleFactorPrime2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_13241 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        System.out.println(A * B / gcd2(A, B));

        br.close();
    }

    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        System.out.println(A * B / gcd1(A, B));

        br.close();
    }

    static long gcd1(long a, long b) {
        if (b == 0) return a;

        long r = a % b;
        a = b;
        b = r;

        return gcd1(a, b);
    }

    static long gcd2(long a, long b) {
        while (b > 0) {
            long r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

}
