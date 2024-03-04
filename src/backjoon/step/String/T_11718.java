package backjoon.step.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_11718 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());

        while (true) {
            String str = br.readLine();

            if (str == null || str.equals("")) break;

            sb.append("\n").append(str);
        }

        System.out.println(sb);

        br.close();
    }

}
