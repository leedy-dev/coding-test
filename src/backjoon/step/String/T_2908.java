package backjoon.step.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_2908 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 2; i >= 0; i--) {
            sb1.append(s1.charAt(i));
            sb2.append(s2.charAt(i));
        }

        int n1 = Integer.parseInt(sb1.toString());
        int n2 = Integer.parseInt(sb2.toString());

        System.out.println(n1 > n2 ? n1 : n2);

        br.close();
    }

}
