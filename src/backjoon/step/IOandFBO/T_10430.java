package backjoon.step.IOandFBO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_10430 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        sb.append((A + B) % C).append("\n");
        sb.append(((A % C) + (B % C)) % C).append("\n");
        sb.append((A * B) % C).append("\n");
        sb.append(((A % C) * (B % C)) % C);

        System.out.println(sb);

        br.close();
    }

}
