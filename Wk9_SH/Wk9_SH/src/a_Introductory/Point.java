package a_Introductory;
/* Author: Sumit Kumar
 * Date: 10/03/2018
 */
public class Point {
	public Integer x, y;
	
	Point(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	public Point add(Point p) {
		return new Point(x + p.x, y + p.y);
	}
	
	public Point sub(Point p) {
		return new Point(x - p.x, y - p.y);
	}
}
