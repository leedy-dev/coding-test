package backjoon.step.MultipleFactorPrime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_2501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int res = 0;
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) count++;

            if (i == (int) Math.sqrt(N) && count*2 < K) break;

            if (count == K) {
                res = i;
                break;
            }
        }

        System.out.println(res);

        br.close();
    }

}
