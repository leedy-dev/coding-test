package backjoon.step.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_2231 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int M = 0;

        for (int n = 1; n < N; n++) {
            int sum = n;

            int num = n;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum == N) {
                M = n;
                break;
            }
        }

        System.out.println(M);

        br.close();
    }

}
