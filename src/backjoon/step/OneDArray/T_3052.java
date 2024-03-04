package backjoon.step.OneDArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class T_3052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> list = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());

            list.add(num % 42);
        }

        System.out.println(list.size());

        br.close();
    }

}
