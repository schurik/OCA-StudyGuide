package chapter1.review;

public class WaterBottle {

    private String brand;
    private boolean empty;

    public static void main(String... args) {
        WaterBottle wb = new WaterBottle();
        System.out.print("Empty "+wb.empty);
        System.out.print(", Brand "+wb.brand);

        Water w = new Water(); // same package no import

        double d1 = 1_00.0;

        int amount = 0b101;
        System.out.println(amount);
    }
}
