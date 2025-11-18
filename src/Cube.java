public class Cube {
    private int side;

    public Cube() {             //setter method: Default 1
        this.side = 1;
    }

    public Cube(int side) {     //setter method: Takes input, passes to setSide
        setSide(side);
    }

    public int getSide() {      //get side after it is set: default 1
        return side;
    }

    public void setSide(int side) {     //Takes input from Cube, then sets this.side to input if it is valud
        if (side <= 0) {
            throw new IllegalArgumentException("Side length must be positive");
        }
        this.side = side;
    }

    public int calculateSurfaceArea() {     //Calculates surface area by finding sa of one side, then multiplying by 6
        return side * side * 6;
    }

    public int calculateVolume() {          //Calculates volume by cube
        return side * side * side;
    }

    public String toString() {              //Returns cube attributes
        return "Cube{side=" + side + "}";
    }
}
