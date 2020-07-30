package PageWiseLIB;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import CommonLIB.GetBrowserElement;
import Repositories.Hero2ContextMenuRepository;

public class Hero2ContextMenuPageLIB {
	
	public void HeroContext() throws Exception {		
		
		Actions action= new Actions(GetBrowserElement.getDriver());	
		
		action.moveToElement(GetBrowserElement.getWebElementByXpath(Hero2ContextMenuRepository.Box));
		
		action.contextClick(GetBrowserElement.getWebElementByXpath(Hero2ContextMenuRepository.Box)).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		Alert alert= GetBrowserElement.getDriver().switchTo().alert();
		
		String msg= GetBrowserElement.getDriver().switchTo().alert().getText();
		
		System.out.println(msg);
		Thread.sleep(2000);
		
		alert.accept();
		
	}

}
