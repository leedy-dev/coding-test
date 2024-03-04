package backjoon.step.TwoDArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_2563 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] array = new boolean[100][100];

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            for (int j = p; j < p+10 && j < 100; j++) {
                for (int k = q; k < q+10 && k < 100; k++) {
                    array[j][k] = true;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (array[i][j]) count++;
            }
        }

        System.out.println(count);

        br.close();
    }

}
