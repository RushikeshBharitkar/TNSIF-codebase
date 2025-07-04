package day5_project4;

public class studentss extends person {
private String clas;
private float percent;

public studentss() {
	super();
	System.out.println("student class default constructor");
	clas="be";
	percent=1222.2f;
	
}

public studentss(String clas, float percent,String name, String city) {
	super();
	this.clas = clas;
	this.percent = percent;
}

public String getClas() {
	return clas;
}

public void setClas(String clas) {
	this.clas = clas;
}

public float getPercent() {
	return percent;
}

public void setPercent(float percent) {
	this.percent = percent;
}

public String toString() {
	return "studentss [clas=" + clas + ", percent=" + percent + ", getName()="
			+ getName() + ", getCity()=" + getCity() + "]";
}



}
