package project5;

public class rectangular {
float width;
float height;
public rectangular() {
	width=3.2f;
	height=2.0f;
}
public rectangular(float width, float height) {
	super();
	this.width = width;
	this.height = height;
}
@Override
public String toString() {
	return "rectangular [width=" + width + ", height=" + height + "]";
}

}
