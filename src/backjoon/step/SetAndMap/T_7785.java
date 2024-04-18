package backjoon.step.SetAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class T_7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String action = st.nextToken();

            if (action.equals("enter")) set.add(name);
            else set.remove(name);
        }

        br.close();

        set.stream().sorted(Collections.reverseOrder())
                .forEach(s -> sb.append(s).append("\n"));

        System.out.println(sb);
    }

}
