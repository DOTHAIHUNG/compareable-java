package compareable;

public class ComPareableCircle extends Circle implements Comparable<ComPareableCircle>{
    public ComPareableCircle() {
    }

    public ComPareableCircle(double radius) {
        super(radius);
    }

    public ComPareableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComPareableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
