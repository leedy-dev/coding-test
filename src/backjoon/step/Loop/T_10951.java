package backjoon.step.Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_10951 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        while (true) {
            String str = br.readLine();

            if (str == null) break;

            if (!sb.toString().equals("")) sb.append("\n");

            st = new StringTokenizer(str);

            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
        }

        System.out.println(sb);

        br.close();
    }

}
