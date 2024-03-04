package backjoon.step.IOandFBO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_2588 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();

        for (int i = B.length()-1; i >= 0; i--) {
            sb.append(A * Character.getNumericValue(B.charAt(i))).append("\n");
        }

        sb.append(A * Integer.parseInt(B));

        System.out.println(sb);

        br.close();
    }

}
