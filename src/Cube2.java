import java.util.Objects;

public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        this.basicCube = new Cube();
        this.color = "black";
    }

    public Cube2(int side) {
        this();
        basicCube.setSide(side);
    }

    public Cube2(int side, String color) {
        this(side);
        this.color = color;
    }

    public int getSide() {
        return basicCube.getSide();
    }

    public void setSide(int side){
        this.basicCube.setSide(side);
    }

    public String getColor() {
        return color;
    }

    //the following methods have been started for you, but need to be completed
    public int calculateVolume() {
        return basicCube.calculateVolume();
    }
    public int calculateSurfaceArea() {
        return basicCube.calculateSurfaceArea();
    }
    public Cube2 add(Cube2 otherCube) {
        int a = this.getSide();
        int b = otherCube.getSide();

        double c_double = Math.sqrt(a*a + b*b);
        int c = (int) c_double;

        if (c_double == c && a > 0 && b > 0 && (a * a + b * b == c * c)) {
            return new Cube2(c, this.color);
        } else {
            throw new IllegalArgumentException("Side lengths do not form a Pythagorean triple");
        }

    }
    public Cube2 minus(Cube2 otherCube) {
        int a = this.getSide();
        int b = otherCube.getSide();

        int diff = Math.abs(a * a - b * b);
        int c = (int) Math.sqrt(diff);

        if (c * c == diff && c > 0) {
            return new Cube2(c, this.color);

        } else {
            throw new IllegalArgumentException("Side lengths do not form a Pythagorean triple");
        }

    }

    public boolean equals(Cube2 otherCube) {
        return (this.getSide() == otherCube.getSide() && Objects.equals(this.getColor(), otherCube.getColor()));
    }

    public String toString() {
        return ("Cube{side=" + this.getSide() + ", color=\"" + this.getColor() + "\"}");
    }
}
