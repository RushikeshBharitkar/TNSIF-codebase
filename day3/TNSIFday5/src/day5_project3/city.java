package day5_project3;

public class city extends state {
	private String cityname;
	private float area;
	
	//geter seter
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	//to string
	public String toString() {
		return "city [cityname=" + cityname + ", area=" + area
				+ ", getStatename()=" + getStatename() + ", getLang()="
				+ getLang() + ", getCountryname()=" + getCountryname()
				+ ", getCapital()=" + getCapital() + "]";
	}
	

}
