package backjoon.step.MultipleFactorPrime2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_2485 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        br.close();

        int gcd = 0;

        for (int i = 1; i < N; i++) {
            int dif = arr[i] - arr[i-1];

            gcd = gcd(dif, gcd);
        }

        // 전체 - 심어져있는 가로수
        System.out.println((arr[N-1] - arr[0]) / gcd + 1 - arr.length);
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
