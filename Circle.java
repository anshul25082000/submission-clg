import java.util.*;
class Circle
{
	double radius;
	double findArea()
	{
		return radius*radius*3.14;
	}
	void displayArea()
	{
		System.out.print("Area ="+ findArea());
	}
}