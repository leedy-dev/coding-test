package backjoon.step.SetAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class T_1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> nameMap = new HashMap<>();
        Map<Integer, String> numMap = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();

            nameMap.put(name, i);
            numMap.put(i, name);
        }

        for (int i = 0; i < M; i++) {
            String question = br.readLine();

            if (nameMap.containsKey(question)) sb.append(nameMap.get(question));
            else sb.append(numMap.get(Integer.valueOf(question)));

            sb.append("\n");
        }

        br.close();

        System.out.println(sb);
    }

}
