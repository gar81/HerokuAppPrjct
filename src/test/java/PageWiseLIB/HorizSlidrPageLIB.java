package PageWiseLIB;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import CommonLIB.GetBrowserElement;
import CommonLIB.ObjectCreationClass;
import Repositories.HeroKaHomePageRepository;
import Repositories.HorizSliderPageRepository;

public class HorizSlidrPageLIB {
public void Slider() throws Exception {
		
		//clicked on homepage horizontal slider link
	ObjectCreationClass.ComLiB.ClickObject(GetBrowserElement.getWebElementByXpath(HeroKaHomePageRepository.HorizontalSliderLink));
	
    //Actions action= new Actions(GetBrowserElement.getDriver());	
    
    //action.clickAndHold(GetBrowserElement.getWebElementByXpath(HorizSliderPageRepository.slider)).moveByOffset(88, 46).build().perform();
    
    //GetBrowserElement.getWebElementByXpath(HorizSliderPageRepository.slider).click();
    
    GetBrowserElement.getWebElementByXpath(HorizSliderPageRepository.slider).sendKeys(Keys.END);
    
    
    
    
}	

}
