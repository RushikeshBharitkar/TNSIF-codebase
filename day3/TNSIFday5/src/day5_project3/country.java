package day5_project3;

public class country {
private String countryname;
private String capital;

//geter seter
public String getCountryname() {
	return countryname;
}


public void setCountryname(String countryname) {
	this.countryname = countryname;
}


public String getCapital() {
	return capital;
}


public void setCapital(String capital) {
	this.capital = capital;
}

//to string
public String toString() {
	return "country [countryname=" + countryname + ", capital=" + capital + "]";
}
}
