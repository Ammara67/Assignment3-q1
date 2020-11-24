public class Shape
{
	private
	String color;
	boolean filled;
	public Shape()
	{
		color="green";
		filled= true;
	}
	public Shape(String c, boolean f) 
	{
		color=c;
		filled=f;
	}
	public String getColor() 
 	{
 		return color;
 	}	
 	public void setColor(String c)
 	{	
 		color=c;
 	}
 	public boolean isFilled()
 	{
 		return filled;
 	}
 	public void setFilled(boolean f)
 	{	
 		filled=f;
 	}
 	public String toString()
 	{
 		if (filled==true)
 			return "A Shape with color of "+color+" and filled";
 		else
 			return "A Shape with color of "+color+" and Not filled";	
 	}
}
