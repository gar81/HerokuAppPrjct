package TestCases;

import org.testng.annotations.*;

import CommonLIB.GetBrowserElement;
import CommonLIB.ObjectCreationClass;
import CommonLIB.TestNgFrameWorkBasic;
import Repositories.CommonRepository;
import Repositories.FacebookHomePageRepository;

public class Facebook  extends TestNgFrameWorkBasic {	

	@Test(priority=3, enabled=true)
	public void FaceBook_TestCases1() throws Exception{
		ObjectCreationClass.ComLiB.FocusOnUrl(CommonRepository.url1);
		
		//LOGIN FEATURE ON FACEBOOK PAGE	
		ObjectCreationClass.fc.info("katy", "134");
		
		//DROPDOWN FEATURE ON FACEBOOK PAGE		
		ObjectCreationClass.fc.Mdy("Aug","12", "2008" );
		
		
		
	}		
	
}













