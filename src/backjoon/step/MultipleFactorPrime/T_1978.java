package backjoon.step.MultipleFactorPrime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int res = N;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                res--;
                continue;
            }

            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    res--;
                    break;
                }
            }
        }

        System.out.println(res);

        br.close();
    }

}
