public class Circle extends Shape
{
		private
		Shape s1=new Shape("yellow",true);
		double radius;
		public
		Circle()
		{
			radius=1.0;
		}
		public Circle(double r)
		{
			radius=r;
		}
		public Circle(double r,String c,boolean f)
		{
			radius=r;
			s1.setColor(c);
			s1.setFilled(f);
		}
		double getradius()
		{
			return radius;
		}
		void setradius (double r)
		{
			radius=r;
		}
		double getArea()
		{
			return 3.14*radius*radius;
		}
		double getPerimeter()
		{
			return 2*3.14*radius;
		}
		public String toString()
		{
			if (s1.isFilled()==true)
	 			return "A Circle with radius= "+radius+" , which is a subclass of A Shape with color of "+s1.getColor()+" and filled";
	 		else
	 			return "A Circle with radius= "+radius+" , which is a subclass of A Shape with color of "+s1.getColor()+" and Not filled";
		}
}
