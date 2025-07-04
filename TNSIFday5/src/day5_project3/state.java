package day5_project3;
//child of country
//example of multilevel
public class state extends country {
private String statename;
private String lang;
//geter seter
public String getStatename() {
	return statename;
}

public void setStatename(String statename) {
	this.statename = statename;
}

public String getLang() {
	return lang;
}

public void setLang(String lang) {
	this.lang = lang;
}
//to string
public String toString() {
	return "state [statename=" + statename + ", lang=" + lang
			+ ", getCountryname()=" + getCountryname() + ", getCapital()="
			+ getCapital() + "]";
}
}
