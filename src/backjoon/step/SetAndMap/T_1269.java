package backjoon.step.SetAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class T_1269 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;

        int sizeA = Integer.parseInt(st.nextToken());
        int sizeB = Integer.parseInt(st.nextToken());

        Set<String> setA = new HashSet<>();

        // set A
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < sizeA; i++) {
            setA.add(st.nextToken());
        }

        // set B
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < sizeB; i++) {
            String num = st.nextToken();

            if (setA.contains(num)) {
                setA.remove(num);
            } else {
                cnt++;
            }
        }

        br.close();

        System.out.println(setA.size() + cnt);
    }

}
