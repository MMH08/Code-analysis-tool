package test.org.concordia.soen691.assignment;

import java.io.FileNotFoundException;

public class Test9{
	public Test9() {
		System.out.println("Test object created");
	}
	
	public void aMethod() {
		
		try {
			File f= new File("someFile"); 
		}
		catch(FileNotFoundException e) {
			try {
				String a = null;
			}
			catch(NullPointerException e) {
				e.printStackTrace();
				throw new IOException("destructive wrapping");
			}
			e.printStackTrace();
			throw new IOException("destructive wrapping");
		}
		
	}
}