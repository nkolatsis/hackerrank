package intro.stdin_stdout_ii;

import java.util.Scanner;

public class Solution {

    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        double d1 = scanner.nextDouble();
        String skip = scanner.nextLine();
        String s1 = scanner.nextLine();
        
        System.out.println("String: " + s1);
        System.out.println("Double: " + d1);
        System.out.println("Int: " + i1);
    }
}
