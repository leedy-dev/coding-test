package backjoon.step.OneDArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_5597 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] array = new boolean[30];

        for (int i = 0; i < 28; i++) {
            array[Integer.parseInt(br.readLine()) - 1] = true;
        }

        for (int i = 0; i < array.length; i++) {
            if (!array[i]) {
                if (sb.toString().equals("")) sb.append(i+1).append("\n");
                else sb.append(i+1);
            };
        }

        System.out.println(sb);

        br.close();
    }

}
