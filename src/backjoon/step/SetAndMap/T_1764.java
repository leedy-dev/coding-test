package backjoon.step.SetAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class T_1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String name = br.readLine();

            if (set.contains(name)) {
                list.add(name);
            }
        }

        br.close();

        Collections.sort(list);

        sb.append(list.size()).append("\n");

        for (String s : list) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }

}
