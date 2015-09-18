
public class Point {

	int x;
	int y;
	
	public static void main(String[] args) {
	Point p= new Point();
	p.x=10;
	p.y=20;
	System.out.println(p.x+"--"+p.y);
	swapValues(p);
	System.out.println(p.x+"--"+p.y);
	//demo test
	}
	
	public static void swapValues(Point p)
	{int temp=p.x;
	p.x=p.y;
	p.y=temp;
	}
 
}
