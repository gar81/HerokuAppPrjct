package TestCases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.codoid.products.exception.FilloException;


import CommonLIB.ExcelRead;
import CommonLIB.ObjectCreationClass;
import CommonLIB.TestNgFrameWorkBasic;
import Repositories.CommonRepository;

public class Facebook  extends TestNgFrameWorkBasic {
	

	@Test
	public void FaceBook_TestCases1() throws Exception{
		ObjectCreationClass.ComLiB.FocusOnUrl(CommonRepository.url1);
		ObjectCreationClass.fc.info("katy", "134");
		
		
	}

		
	
}













