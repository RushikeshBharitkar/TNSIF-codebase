package day7_project1;

public class point {
//constructor overloading
	// a class can have multipe class having differnet paramerters
	
	private float x;
	private float y;
	//default
	public point(){
		x=0.0f;
		y=0.0f;
	}
//parameterized for x
	public point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
//para for x y
	public point(float x) {
		super();
		this.x = x;
	}
	//to string
	public String toString() {
		return "point [x=" + x + ", y=" + y + "]";
	}
	
	
}
