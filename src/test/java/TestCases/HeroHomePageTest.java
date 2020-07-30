package TestCases;

import org.testng.annotations.Test;

import CommonLIB.ObjectCreationClass;
import CommonLIB.TestNgFrameWorkBasic;
import Repositories.CommonRepository;

public class HeroHomePageTest extends TestNgFrameWorkBasic {
	
	@Test(priority=4, enabled=true)
	
	public void Hero_ContextMenu() throws Exception{
		ObjectCreationClass.ComLiB.FocusOnUrl(CommonRepository.url2);		
			
		ObjectCreationClass.hb.HeroPage();
		}
}