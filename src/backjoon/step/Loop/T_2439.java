package backjoon.step.Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_2439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-i-1; j++) {
                sb.append(" ");
            }

            for (int j = 0; j < i+1; j++) {
                sb.append("*");
            }

            if (i < N-1) sb.append("\n");
        }

        System.out.println(sb);

        br.close();
    }

}
