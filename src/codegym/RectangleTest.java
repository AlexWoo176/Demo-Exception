package codegym;

import java.util.Scanner;

public class RectangleTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter length is Triangle: ");
            double length = scanner.nextDouble();

            System.out.println("Enter width is Triangle: ");
            double width = scanner.nextDouble();

            Rectangle rectangle = new Rectangle(length, width);
            System.out.println("Area of Rectangle is " + rectangle.getArea());
        }
        catch (NegativeValueException ex)
        {
//            ex.printStackTrace();
            System.out.println("Nagative Value Exception" + ex.toString());
        }
    }
}
