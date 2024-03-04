package backjoon.step.Condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_2525 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int th = t / 60;
        int tm = t % 60;

        int rh = h + th;
        int rm = m + tm;

        if (rm >= 60) {
            rm = rm - 60;
            sb.append(getHour(++rh)).append(" ").append(rm);
        } else {
            sb.append(getHour(rh)).append(" ").append(rm);
        }

        System.out.println(sb);

        br.close();
    }

    private static int getHour(int h) {
        if (h >= 24) {
            return h - 24;
        } else {
            return h;
        }
    }

}
