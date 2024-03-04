package backjoon.step.MultipleFactorPrime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_2581 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int min = -1;
        int sum = 0;

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        for (int i = M; i <= N; i++) {
            boolean isPrime = true;

            if (i == 1) continue;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                if (min == -1) min = i;
                sum += i;
            }
        }

        if (min == -1) sb.append(min);
        else sb.append(sum).append("\n").append(min);

        System.out.println(sb);

        br.close();
    }

}
