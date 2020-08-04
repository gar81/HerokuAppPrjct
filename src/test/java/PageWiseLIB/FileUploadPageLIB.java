package PageWiseLIB;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import CommonLIB.GetBrowserElement;
import CommonLIB.ObjectCreationClass;
import Repositories.FileUploadRepository;
import Repositories.HeroKaHomePageRepository;

public class FileUploadPageLIB {
	
	/***********************************************************************
	 * Name : File Upload	  
	 * @param data 
	 * @return 
	 * ReturnType: void 
	 * @throws Exception 
	 ***********************************************************************/
	
	public void fileUpload() throws Exception {
		Robot robot= new Robot();
		
		ObjectCreationClass.ComLiB.ClickObject(GetBrowserElement.getWebElementByXpath(HeroKaHomePageRepository.FileUploadLink));
		ObjectCreationClass.ComLiB.ClickObject((FileUploadRepository.chooseFile));		
		//robot.setAutoDelay(2000);		
		
		
		StringSelection stringselection= new StringSelection("D:\\text1"); 
		
		//CTRL C ACTION		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		robot.setAutoDelay(1000);
		
		//CTRL V ACTION		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_K);
		robot.setAutoDelay(1000);
		
		//ENTER	ACTION	
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//ObjectCreationClass.ComLiB.ClickObject(GetBrowserElement.getWebElementByXpath(FileUploadRepository.upload));		
	}
}
