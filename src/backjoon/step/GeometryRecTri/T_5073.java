package backjoon.step.GeometryRecTri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class T_5073 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());

            List<Integer> list = new ArrayList<>();

            list.add(Integer.valueOf(st.nextToken()));
            list.add(Integer.valueOf(st.nextToken()));
            list.add(Integer.valueOf(st.nextToken()));

            if (list.get(0) == 0 || list.get(1) == 0 || list.get(2) == 0) break;

            Collections.sort(list);

            if (list.get(2) >= list.get(0) + list.get(1)) System.out.println("Invalid");
            else if (list.get(0).equals(list.get(1)) && list.get(0).equals(list.get(2))) System.out.println("Equilateral");
            else if (!list.get(0).equals(list.get(1)) && !list.get(0).equals(list.get(2)) && !list.get(1).equals(list.get(2))) System.out.println("Scalene");
            else System.out.println("Isosceles");
        }

        br.close();
    }

}
