package intro.stdin_stdout_i;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();
        scanner.close();
        
        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int3);
    }
}