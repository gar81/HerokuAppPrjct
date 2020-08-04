package TestCases;

import org.testng.annotations.Test;

import CommonLIB.ObjectCreationClass;
import CommonLIB.TestNgFrameWorkBasic;
import Repositories.CommonRepository;

public class FileUploadPageTest extends TestNgFrameWorkBasic {
	
	@Test(priority=9, enabled=true)
	
	public void Hero_FileUpload() throws Exception{
		ObjectCreationClass.ComLiB.FocusOnUrl(CommonRepository.url2);		
			
		ObjectCreationClass.fb.fileUpload();
		}

}
