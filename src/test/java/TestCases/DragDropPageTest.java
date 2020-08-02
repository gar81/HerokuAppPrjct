package TestCases;

import org.testng.annotations.Test;

import CommonLIB.ObjectCreationClass;
import CommonLIB.TestNgFrameWorkBasic;
import Repositories.CommonRepository;

public class DragDropPageTest extends TestNgFrameWorkBasic {
	
	@Test(priority=7, enabled=true)
	
	public void DragDrop() throws Exception{
		ObjectCreationClass.ComLiB.FocusOnUrl(CommonRepository.url2);		
			
		ObjectCreationClass.dp.DropDown();
		}
}
