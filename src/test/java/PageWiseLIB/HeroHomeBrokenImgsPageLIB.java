package PageWiseLIB;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import CommonLIB.GetBrowserElement;
import CommonLIB.ObjectCreationClass;
import Repositories.HeroBrokenImgsRepository;
import Repositories.HeroKaHomePageRepository;

/***********************************************************************
 * Name : BrokenImages
 * @return 
 * ReturnType: void

 ***********************************************************************/

public class HeroHomeBrokenImgsPageLIB {
	
	public void BrknImgs() throws Exception {
		ObjectCreationClass.ComLiB.ClickObject(GetBrowserElement.getWebElementByXpath(HeroKaHomePageRepository.BrokenImagesLink));
		
		//step1: get the list of all links and images
		List<WebElement> list=GetBrowserElement.getWebElementsByXpath(HeroBrokenImgsRepository.links);
	    list.addAll(GetBrowserElement.getWebElementsByXpath(HeroBrokenImgsRepository.imgs));
	    System.out.println("total links n imgs available :" +list.size());
	    
	    List<WebElement> activelinks= new ArrayList<WebElement>();
	    
	    //step2: Iterate above created list object
	    for(int i=0; i<list.size(); i++) {
	    	System.out.println(list.get(i).getAttribute("href"));
	    	if(list.get(i).getAttribute("href")!=null && (!list.get(i).getAttribute("href").contains("javascript"))) {
	    		activelinks.add(list.get(i));
	    	}
	    }
	    
	    //step3: get the size of activelinks list	    
	    System.out.println("size of active links and imgs : " +activelinks.size());
	    
	    //step4: chk the href url (whether correct or not), with httpconnection api.
	    for(int j=0; j< activelinks.size(); j++) {
	    	
			 HttpURLConnection connection= (HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
			 connection.connect();
			 String response=  connection.getResponseMessage();
			 connection.disconnect();
			 System.out.println(activelinks.get(j).getAttribute("href")+ " "+response);
	    }
		
	}

}
