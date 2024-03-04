package backjoon.step.Advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_3003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array = new int[]{1, 1, 2, 2, 2, 8};

        sb.append(array[0] - Integer.parseInt(st.nextToken()));

        for (int i = 1; i < array.length; i++) {
            sb.append(" ").append(array[i] - Integer.parseInt(st.nextToken()));
        }

        System.out.println(sb);

        br.close();
    }

}
