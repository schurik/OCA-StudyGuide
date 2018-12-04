package chapter3.review;

public class StringsReview {

    public static void main(String[] args) {
        String a = "a";
        System.out.println(a == "a");

        a += "b";
        System.out.println(a == "ab");

        String ab = new String(a);

        System.out.println(a == ab);


        final StringBuilder puzzle = new StringBuilder("Java");

        System.out.println(puzzle.reverse());
        // "vaJ"
        System.out.println(puzzle.append("vaJ$").delete(0,4).deleteCharAt(puzzle.length()-1));
        System.out.println(puzzle.append("vaJ$").delete(0,3).deleteCharAt(puzzle.length()));
    }
}
