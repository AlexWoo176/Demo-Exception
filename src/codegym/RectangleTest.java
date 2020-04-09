package codegym;

public class RectangleTest {

    public static void main(String[] args) {
        try {
            Rectangle rectangle = new Rectangle(17.6, 14.1);
            System.out.println("Area of Rectangle is " + rectangle.getArea());
        }
        catch (NegativeValueException ex)
        {
            ex.printStackTrace();
            System.out.println("Nagative Value Exception");
        }
    }
}
