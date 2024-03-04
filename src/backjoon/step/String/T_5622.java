package backjoon.step.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_5622 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += getNumber(str.charAt(i)) + 1;
        }

        System.out.println(sum);

        br.close();
    }

    public static int getNumber(char c) {
        int i = 1;

        if (c >= 'A') i++;
        if (c >= 'D') i++;
        if (c >= 'G') i++;
        if (c >= 'J') i++;
        if (c >= 'M') i++;
        if (c >= 'P') i++;
        if (c >= 'T') i++;
        if (c >= 'W') i++;

        return i;
    }

}
