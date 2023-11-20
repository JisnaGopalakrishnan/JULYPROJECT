package testpkg;

import org.testng.annotations.Test;

import pagepkg.Baseclass;
import pagepkg.Homepage;

public class Testclass extends Baseclass {
	
	
	@Test
	public void test() {
		Homepage b = new Homepage(driver);
		b.destination();
		b.checkinoutDetails();
		b.personalData();
		b.search();
	}
	

}