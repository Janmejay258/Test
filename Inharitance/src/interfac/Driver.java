package interfac;

public interface Driver {
	
	
        void get(String url);
        public void findElement(String locator);
		public void findElements(String locator);
		void click();
		static void close() {
			
		}
	
	}

class FirefoxDriver implements Driver {


	
	public void get(String url) {
		System.out.println(" Enter Url ");
		
	}

	@Override
	public void findElement(String locator) {
		System.out.println(locator);
		
	}

	@Override
	public void findElements(String locator) {
		System.out.println(locator);
		
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}}
