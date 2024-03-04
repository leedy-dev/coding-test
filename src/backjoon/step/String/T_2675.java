package backjoon.step.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for (int j = 0; j < S.length(); j++) {
                char c = S.charAt(j);

                for (int k = 0; k < R; k++) {
                    sb.append(c);
                }
            }

            if (i < T-1) sb.append("\n");
        }

        System.out.println(sb);

        br.close();
    }

}
