package TestCases;

import org.testng.annotations.Test;

import CommonLIB.ObjectCreationClass;
import CommonLIB.TestNgFrameWorkBasic;
import Repositories.CommonRepository;

public class HorizSlidrPageTest extends TestNgFrameWorkBasic {
	
@Test(priority=8, enabled=true)
	
	public void sldr() throws Exception{
		ObjectCreationClass.ComLiB.FocusOnUrl(CommonRepository.url2);		
			
		ObjectCreationClass.hs.Slider();
		}
	
	
	

}
