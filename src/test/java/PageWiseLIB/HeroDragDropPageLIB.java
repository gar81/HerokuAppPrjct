package PageWiseLIB;

import org.openqa.selenium.interactions.Actions;

import CommonLIB.GetBrowserElement;
import CommonLIB.ObjectCreationClass;
import Repositories.DragDropPageRepository;
import Repositories.HeroKaHomePageRepository;

/***********************************************************************
 * Name : Drag n Drop
 * @return 
 * ReturnType: void

 ***********************************************************************/

public class HeroDragDropPageLIB {	
	public void DropDown() throws Exception {
		
		//clicked on homepage drag n drop link
	ObjectCreationClass.ComLiB.ClickObject(GetBrowserElement.getWebElementByXpath(HeroKaHomePageRepository.DragDropLink));
	
    Actions action= new Actions(GetBrowserElement.getDriver());	
	action.clickAndHold(GetBrowserElement.getWebElementByXpath(DragDropPageRepository.src)).
	       moveToElement(GetBrowserElement.getWebElementByXpath(DragDropPageRepository.target)).release().build().perform();
	
	
}}


