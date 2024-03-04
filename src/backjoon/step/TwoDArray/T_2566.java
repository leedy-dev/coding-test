package backjoon.step.TwoDArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_2566 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int max = 0;
        int p = 0;
        int q = 0;

        StringTokenizer st;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 9; j++) {
                int n = Integer.parseInt(st.nextToken());

                if (n >= max) {
                    max = n;
                    p = i+1;
                    q = j+1;
                }
            }
        }

        sb.append(max).append("\n");
        sb.append(p).append(" ").append(q);

        System.out.println(sb);

        br.close();
    }

}
