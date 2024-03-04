package backjoon.step.Advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_10988 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = str.length()-1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        System.out.println(str.equals(sb.toString()) ? 1 : 0);

        br.close();
    }

}
