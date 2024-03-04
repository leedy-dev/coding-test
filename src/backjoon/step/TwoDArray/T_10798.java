package backjoon.step.TwoDArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_10798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[][] array = new char[5][];
        int maxLength = 0;

        for (int i = 0; i < 5; i++) {
            String str = br.readLine();

            int c = str.length();
            maxLength = c > maxLength ? c : maxLength;

            array[i] = new char[c];

            for (int j = 0; j < c; j++) {
                array[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < array[j].length) sb.append(array[j][i]);
            }
        }

        System.out.println(sb);

        br.close();
    }

}
