public class Rectangle extends Shape
{
		private
		Shape s1=new Shape("yellow",true);
		double width,length;
		public
		Rectangle()
		{
			width=1.0;
			length=1.0;
		}
		Rectangle(double w,double l) 
		{
			width=w;
			length=l;
		}
		Rectangle(double w,double l,String c, boolean f)
		{
			width=w;
			length=l;
			s1.setColor(c);
			s1.setFilled(f);
		}
	 	double getwidth()
	 	{
	 		return width;
	 	}
	 	void setwidth(double w) 
	 	{
	 		width=w;
	 	}
	 	double getlength()
	 	{
	 		return length;
	 	}
	 	void setlength(double l) 
	 	{
	 		length=l;
	 	}
	 	double getArea() 
	 	{
	 		return length*width;
	 	}
	 	double getPerimeter()
	 	{
	 		return 2*length+2*width;
	 	}
	 	public String toString() 
	 	{
	 		if (s1.isFilled()==true)
	 			return "A Rectangle with width= "+width+" and length= "+length+" ,which is a subclass of A Shape with color of "+s1.getColor()+" and filled";
	 		else
	 			return "A Rectangle with width= "+width+" and length= "+length+" ,which is a subclass of A Shape with color of "+s1.getColor()+" and not filled";
	 	}
}
