package backjoon.step.IOandFBO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_11382 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken()));

        br.close();
    }

}
