package compareable;

import java.util.Arrays;

public class CompareableCircleTest {
    public static void main(String[] args) {
        ComPareableCircle[] compareableCircles = new ComPareableCircle[3];
        compareableCircles[0] = new ComPareableCircle();
        compareableCircles[1] = new ComPareableCircle(25.9);
        compareableCircles[2] = new ComPareableCircle("red", true, 9.25);

        System.out.println("Pre-sorted:");
        for (ComPareableCircle compareableCircle : compareableCircles) {
            System.out.println(compareableCircle);
        }

        Arrays.sort(compareableCircles);

        System.out.println("After-sorted:");
        for (ComPareableCircle compareableCircle : compareableCircles) {
            System.out.println(compareableCircle);
        }
    }
}
