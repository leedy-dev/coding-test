package backjoon.step.IOandFBO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_10869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        sb.append(A+B).append("\n");
        sb.append(A-B).append("\n");
        sb.append(A*B).append("\n");
        sb.append(A/B).append("\n");
        sb.append(A%B);

        System.out.println(sb);

        br.close();
    }

}
