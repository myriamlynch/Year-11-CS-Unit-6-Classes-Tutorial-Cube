public class Cube {

    private int side;
    public Cube()
    {
        side = 1;
    }

    public Cube(int s)
    {
        if(s < 1)
        {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        else
            side = s;
    }

    public void setSide(int s)
    {
        if(s < 1)
        {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        else
            side = s;
    }

    public int getSide()
    {
       return side;
    }

    public int getSurfaceArea()
    {
        return side * side * 6;
    }

    public int getVolume()
    {
        return side*side*side;
    }

    public String toString()
    {
        return "Cube{side=" + side + "}";
    }
}
