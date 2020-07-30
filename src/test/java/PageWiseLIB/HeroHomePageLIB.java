package PageWiseLIB;

import CommonLIB.GetBrowserElement;
import CommonLIB.ObjectCreationClass;
import Repositories.HeroKaHomePageRepository;

public class HeroHomePageLIB {
	
	public void HeroPage() throws Exception {
		ObjectCreationClass.ComLiB.ClickObject(GetBrowserElement.getWebElementByXpath(HeroKaHomePageRepository.ContextMenu));
		
	}
}
