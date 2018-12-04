package chapter3.review;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class ArraysReview {

    public static void main(String[] args) {
        int [][] a = new int[5][];
        Object[][][] o = new Object[3][][];
        String[] s[] = new String[3][];

        String [] as = {"asdf"};
        String [] as2 = {"asdf"};
        System.out.println(as.equals(as2));

        Integer.parseInt("2");
        Integer.valueOf("4");

        List<String> list = new ArrayList<>();
        list.add("asdf");
        List<String> list2 = new ArrayList<>();
        list2.add("asdf");

        System.out.println(list.equals(list2));

        LocalDate.parse("");

        Hallo hallo = new Hallo();

        ArraysReview review = new ArraysReview();
        //review.a();
    }

    private final void a(Integer i) {}
    private final void a(int i) {}
    private final void a(String s) {}
    private final void a(Object o) {}
}

class Hallo {
    private void b() {

    }
}