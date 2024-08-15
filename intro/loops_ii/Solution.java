package intro.loops_ii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Sample Input
2
0 2 10
5 3 5
 */

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer queries = Integer.parseInt(s.nextLine());

        for (int i = 0; i < queries; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();

            List<String> values = new ArrayList<>();
            Integer value = a;
            for (int j = 0; j < n; j++) {
                value += (int) (Math.pow(2, j) * b);
                values.add(value.toString());
            }
            
            System.out.println(String.join(" ", values));
        }

        s.close();
    }
}