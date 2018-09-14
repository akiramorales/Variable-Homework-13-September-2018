/**
 * 
 * @author Akira Morales
 *Write a program which will display a person's name
 *Write a program which will calculate the area of a rectangle
 *Write a variable which will calculate the area and circumference of a circle
 */
public class VariableHomework13September2018
{
	public static void main(String[] args)
	{
		String name = "Akira\n";
		System.out.print("The name is ");
		System.out.print(name);
		
		int length = 10;
		int width = 12;
		double areaOfRectangle = length * width;
		System.out.print("The area of the rectangle is ");
		System.out.print(areaOfRectangle);
		
		int radius = 3;
		double pi = 3.14;
		double area = radius * radius * pi;
		System.out.print("\nThe area of the circle is ");
		System.out.print(area);
		double circumference = 2 * radius * pi;
		System.out.print("\nThe circumference of the circle is ");
		System.out.print(circumference);
	}
}
