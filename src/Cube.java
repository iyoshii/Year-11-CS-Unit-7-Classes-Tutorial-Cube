public class Cube {
    //properties
    private int side;

    //constructors
    public Cube(){
        this.side=1;
    }

    public Cube(int side){
        if (side < 1) {
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        this.side = side;
    }

    //behaviours
    public int getSide(){
        return side;
    }

    public void setSide(int side){
       this.side = side;
        if (side < 1) {
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
    }

    public int getSurfaceArea(){
        return 6*side*side;
    }

    public int getVolume(){
        return side*side*side;
    }

    public String toString(){
        return "Cube{side=" + side + "}";
    }
}