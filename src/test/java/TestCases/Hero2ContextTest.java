package TestCases;

import org.testng.annotations.Test;

import CommonLIB.ObjectCreationClass;
import CommonLIB.TestNgFrameWorkBasic;
import Repositories.CommonRepository;

public class Hero2ContextTest extends TestNgFrameWorkBasic {
	
	@Test(priority=5, enabled=true)
	
	public void Hero_Context() throws Exception{
		ObjectCreationClass.ComLiB.FocusOnUrl(CommonRepository.url2);		
			
		ObjectCreationClass.cb.HeroContext();
		}

}
