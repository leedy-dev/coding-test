package backjoon.step.Condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_2884 {

    private static final int MINUTE = 45;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (m >= MINUTE) {
            sb.append(h).append(" ").append(m - MINUTE);
        } else {
            m = 60 + m - MINUTE;
            if (h == 0) {
                sb.append("23 ").append(m);
            } else {
                sb.append(h-1).append(" ").append(m);
            }
        }

        System.out.println(sb);

        br.close();
    }

}
