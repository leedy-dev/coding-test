package backjoon.step.IOandFBO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_18108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(Integer.parseInt(br.readLine()) - (2541-1998));

        br.close();
    }

}
