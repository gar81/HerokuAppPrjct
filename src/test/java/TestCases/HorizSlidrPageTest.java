package TestCases;

import org.testng.annotations.Test;

import CommonLIB.ObjectCreationClass;
import Repositories.CommonRepository;

public class HorizSlidrPageTest {
	
@Test(priority=8, enabled=true)
	
	public void sldr() throws Exception{
		ObjectCreationClass.ComLiB.FocusOnUrl(CommonRepository.url2);		
			
		ObjectCreationClass.hs.Slider();
		}
	
	
	

}
