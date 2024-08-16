package intro.static_initializer_block;

import java.util.Scanner;

/* Sample Input
1
3
 */

// https://www.hackerrank.com/challenges/java-static-initializer-block/problem

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int h = s.nextInt();
        s.close();
        try {
            if (b <= 0 || h <= 0) {
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
            System.out.println(b*h);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
