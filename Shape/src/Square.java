public class Square extends Rectangle
{
		private
		Rectangle s1=new Rectangle(5.0,10.0);
		double side;
		public
		Square()
		{
			side=s1.getlength();
		}
		Square(double s)
		{
			side=s;
		}
		Square(double l,String c, boolean f)
		{
			side=l;
			s1.setColor(c);
			s1.setFilled(f);
		}
		double getside()
	 	{
	 		return side;
	 	}
	 	void setside(double s) 
	 	{
	 		side=s;
	 	}
		double getArea() 
	 	{
	 		return side*side;
	 	}
	 	double getPerimeter()
	 	{
	 		return 2*side+2*side;
	 	}
		public String toString()
 		{
			return "A Square with side= "+side+" , which is a subclass of A Rectangle with width= "+s1.getwidth()+" and length= "+s1.getlength();
 		}
}
