package interfac;

public class Test {

	public static void main(String[] args) {
		Driver driver=new FirefoxDriver();
		driver.get("http:\\google.com");
		driver.findElement("Xpath");
		driver.findElements("Id");
	}

}
