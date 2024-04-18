package backjoon.step.MultipleFactorPrime2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 유클리드 호제법
 *
 * A, B의 최대공약수 = GCD(A, B)
 * A와 B의 나머지(A mod B) = r
 * => GCD(A, B) = GCD(B, r) = ... = GCD(?, 0)
 * r이 0이 될 때까지 반복하면 ?값이 최대공약수
 *
 * 최소공배수 LCM(A, B)
 * 두 수의 최대공약수 GCD(A, B) = d
 * A = ad, B= bd 여기서 a와 b는 서로소 (d가 최대공약수이기 때문)
 * LCM(A, B) = a * b * d = A * B / d = A * B / GCD(A, B)
 */
public class T_1934 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a * b / gcd(a, b)).append("\n");
        }

        br.close();

        System.out.println(sb);
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;

        int r = a % b;
        a = b;
        b = r;

        return gcd(a, b);
    }

}
