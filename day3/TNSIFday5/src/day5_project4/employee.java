package day5_project4;

public class employee extends person {
private int emid;
private float sal;
private String dep;
//default
public employee() {
	super();
	System.out.print("this are default values");
	emid=12;
	sal=1234;
	dep="com";
}
//parametrized
public employee(int emid, float sal, String dep,String name, String city) {
	super();
	this.emid = emid;
	this.sal = sal;
	this.dep = dep;
}
//geter seter
public int getEmid() {
	return emid;
}
public void setEmid(int emid) {
	this.emid = emid;
}
public float getSal() {
	return sal;
}
public void setSal(float sal) {
	this.sal = sal;
}
public String getDep() {
	return dep;
}
public void setDep(String dep) {
	this.dep = dep;
}
//to string
public String toString() {
	return "employee [emid=" + emid + ", sal=" + sal + ", dep=" + dep
			+ ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
}


}
