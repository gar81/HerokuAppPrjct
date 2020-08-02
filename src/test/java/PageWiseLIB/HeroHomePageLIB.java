package PageWiseLIB;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

import CommonLIB.GetBrowserElement;
import CommonLIB.ObjectCreationClass;
import Repositories.HeroContextMenuRepository;
import Repositories.HeroKaHomePageRepository;

public class HeroHomePageLIB {
	
	public void HeroPage() throws Exception {
		ObjectCreationClass.ComLiB.ClickObject(GetBrowserElement.getWebElementByXpath(HeroKaHomePageRepository.ContextMenu));
		
        Actions action= new Actions(GetBrowserElement.getDriver());	
		
		action.moveToElement(GetBrowserElement.getWebElementByXpath(HeroContextMenuRepository.Box));
		
		action.contextClick(GetBrowserElement.getWebElementByXpath(HeroContextMenuRepository.Box)).build().perform();		
		
		Alert alert= GetBrowserElement.getDriver().switchTo().alert();
		
		String msg= GetBrowserElement.getDriver().switchTo().alert().getText();
		
		System.out.println(msg);
		Thread.sleep(1000);
		
		alert.accept();		
		
	}
}
