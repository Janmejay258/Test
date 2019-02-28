package method;

public class Demo {
private String name;
private String cityname;
private String gender;
private String cname;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCityname() {
	return cityname;
}
public void setCityname(String cityName) {
	this.cityname = cityName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String toString() {
	return "[ Student name Is "+name +",City name is  "+cityname+" ,Gender is "+gender+",Institution name is "+cname+" ]";
}

}
