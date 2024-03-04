package backjoon.step.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();

        sb.append(S.indexOf('a'));

        for (int i = 'b'; i <= 'z'; i++) {
            sb.append(" ").append(S.indexOf(i));
        }

        System.out.println(sb);

        br.close();
    }

}
