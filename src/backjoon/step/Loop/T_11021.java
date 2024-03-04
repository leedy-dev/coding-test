package backjoon.step.Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_11021 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());

            sb.append("Case #").append(i).append(": ").append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));

            if (i < T) {
                sb.append("\n");
            }
        }

        System.out.println(sb);

        br.close();
    }

}
