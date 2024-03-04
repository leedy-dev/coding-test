package backjoon.step.Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_10952 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());

            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

            if (sum == 0) break;
            else {
                sb.append(sum).append("\n");
            }
        }

        System.out.println(sb);

        br.close();
    }

}
