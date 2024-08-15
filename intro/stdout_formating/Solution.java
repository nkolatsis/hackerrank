package intro.stdout_formating;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/* input
java 100
cpp 65
python 50
*/
class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<String[]> input = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            input.add(s.nextLine().split(" "));
        }
        System.out.println("================================");

        for (String[] stray : input) {
            System.out.printf("%-15s"+"%03d\n", stray[0], Integer.parseInt(stray[1]));
        }

        System.out.println("================================");
        s.close();
    }
}
