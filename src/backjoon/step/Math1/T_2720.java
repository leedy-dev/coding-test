package backjoon.step.Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_2720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());

            sb.append(C/25).append(" ");

            C %= 25;

            sb.append(C/10).append(" ");

            C %= 10;

            sb.append(C/5).append(" ");

            C %= 5;

            sb.append(C);

            if (i < T-1) sb.append("\n");
        }

        System.out.println(sb);

        br.close();
    }

}
