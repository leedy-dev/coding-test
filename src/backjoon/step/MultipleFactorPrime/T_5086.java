package backjoon.step.MultipleFactorPrime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_5086 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == b) break;

            if (!sb.toString().equals("")) sb.append("\n");

            if (a > b && a % b == 0) sb.append("multiple");
            else if (a < b && b % a == 0) sb.append("factor");
            else sb.append("neither");
        }

        System.out.println(sb);

        br.close();
    }

}
