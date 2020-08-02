package TestCases;

import org.testng.annotations.Test;

import CommonLIB.ObjectCreationClass;
import CommonLIB.TestNgFrameWorkBasic;
import Repositories.CommonRepository;

public class HeroBroknImgsTest extends TestNgFrameWorkBasic {
	
	@Test(priority=6, enabled=true)
	
	public void Hero_BrknImgs() throws Exception{
		ObjectCreationClass.ComLiB.FocusOnUrl(CommonRepository.url2);		
			
		ObjectCreationClass.bi.BrknImgs();
		}

}
