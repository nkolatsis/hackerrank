package intro.java_datatypes;

import java.util.Scanner;

/*
 * STDIN
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
 */


public class Solution {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            try {
                long x = s.nextLong();
                System.out.println("" + x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(s.next() + " can't be fitted anywhere.");
            }
        }
        s.close();
    }
}



/*

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            BigInteger value = new BigInteger(s.nextLine());
            List<String> datatypes;
            BigInteger byteValue = new BigInteger(Byte.toString(value.byteValue()));
            BigInteger shortValue = new BigInteger(Short.toString(value.shortValue()));
            BigInteger intValue = new BigInteger(Integer.toString(value.intValue()));
            BigInteger longValue = new BigInteger(Long.toString(value.longValue()));
            if (value.equals(byteValue)) {
                datatypes = Arrays.asList("byte", "short", "int", "long");
            } else if (value.equals(shortValue))  {
                datatypes = Arrays.asList("short", "int", "long");
            } else if (value.equals(intValue))  {
                datatypes = Arrays.asList("int", "long");
            } else if (value.equals(longValue))  {
                datatypes = Arrays.asList("long");
            } else {
                datatypes = new ArrayList<>();
            }
            if (datatypes.size() == 0) {
                System.out.println(value.toString() + " can't be fitted anywhere.");
            } else {
                System.out.println(value.toString() + " can be fitted in:");
                for (String datatype : datatypes) {
                    System.out.println("* " + datatype);
                }
            }
        }
        s.close();
    }
}
*/