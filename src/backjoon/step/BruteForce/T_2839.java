package backjoon.step.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = -1;

        for (int i = N/5; i >= 0; i--) {
            int M = N - i*5;

            if (M % 3 == 0) {
                count = i + M/3;

                break;
            }
        }

        System.out.println(count);

        br.close();
    }

}
