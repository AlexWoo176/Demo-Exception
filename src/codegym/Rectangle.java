package codegym;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle() {
        length = 0;
        width = 0;
    }
    public Rectangle(double length, double width) throws NegativeValueException
    {
        if (length < 0)
        {
            throw new NegativeValueException(length);
        }
        if (width < 0)
        {
            throw new NegativeValueException(width);
        }
        this.length = length;
        this.width = width;
    }
    public void set(double length, double width) throws NegativeValueException
    {
        if (length < 0)
        {
            throw new NegativeValueException(length);
        }
        if (width < 0)
        {
            throw new NegativeValueException(width);
        }
        this.length = length;
        this.width = width;
    }

    public double getArea()
    {
        return length * width;
    }

    public double getPerimeter()
    {
        return 2 * (length + width);
    }
}
