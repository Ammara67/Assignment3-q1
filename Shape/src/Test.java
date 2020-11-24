
public class Test {
	public static void main(String args[])
	{
		Shape s1=new Shape("yellow",true);
		System.out.println(s1);	
		Shape s2 = new Circle(5.0);
		System.out.println(s2);	
		Shape s3= new Circle(5.0,"black",false);
		System.out.println(s3);	
		Shape s4 = new Rectangle(1.0,2.0);
		System.out.println(s4);		
		Shape s5= new Rectangle(1.0,2.0,"White",false);
		System.out.println(s5);	
		Rectangle r1=new Square(6.0);
		System.out.println(r1);	
		Rectangle d1=new Square(6.0,"pink",true);
		System.out.println(d1);	
	}
}
