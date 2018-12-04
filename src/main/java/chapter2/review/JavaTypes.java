package chapter2.review;

import java.util.Arrays;
import static java.util.Collections.sort;

public class JavaTypes {

    private JavaTypes(){

    }
    public static void main(String[] args) {
        byte a = 10;
        byte b = 5;
        double c = a + b;

        final Boolean no = new Boolean("true");
        System.out.println(no==new Boolean(true));
        final JavaTypes javaTypes = new JavaTypes();
        int i = 4/5;

        loop:
        {

        }
        int [] t = new int[] {2,3};

/*
        byte d = (byte) (a + b);


        long x = 5;
        long y = 2 * x;

        System.out.println(x>2 ? x<4 ? 10: 8: 7);


        boolean x=true, z=true;

        int y = 20;
        x = (y != 10) ^ (z=true);
        System.out.println(x +" "+y+" "+z);

        sort(Arrays.asList(1,2));

        StringBuilder sb = new StringBuilder("abcdefg");
        int count = sb.substring(6,5).length();
        System.out.println(count);

        String nameæ[] = {"a", "b", "c"};
*/
    }

    static final void m1() {

    }

    final static void m2(String[] v, int...i) {

    }

}
