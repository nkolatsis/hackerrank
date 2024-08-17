package intro.int_to_string;

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = Integer.toString(s.nextInt());
        s.close();
        if (str instanceof String) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
