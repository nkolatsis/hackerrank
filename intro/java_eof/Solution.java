package intro.java_eof;

import java.util.Scanner;

/* Sample Input
Hello world
I am a file
Read me until end-of-file.
 */

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (int i = 1; s.hasNextLine(); i++) {
            String line = s.nextLine();
            System.out.printf("%d %s\n", i, line);
        }

        s.close();
    }
}