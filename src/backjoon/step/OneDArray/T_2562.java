package backjoon.step.OneDArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = 0;
        int idx = 1;

        for (int i = 1; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num > M) {
                M = num;
                idx = i;
            }
        }

        sb.append(M).append("\n").append(idx);

        System.out.println(sb);

        br.close();
    }

}
