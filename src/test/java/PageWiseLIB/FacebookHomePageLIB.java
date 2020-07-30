package PageWiseLIB;

import CommonLIB.GetBrowserElement;
import CommonLIB.ObjectCreationClass;
import Repositories.FacebookHomePageRepository;

public class FacebookHomePageLIB {

	/***********************************************************************
	 * Name : Login	  
	 * @return 
	 * ReturnType: void 
	 ***********************************************************************/
	public void info(String unamevalue, String pwdvalue) throws Exception {

		ObjectCreationClass.ComLiB.SetOnparam(GetBrowserElement.getWebElementByXpath(FacebookHomePageRepository.email),
				unamevalue);
		ObjectCreationClass.ComLiB
				.SetOnparam(GetBrowserElement.getWebElementByXpath(FacebookHomePageRepository.passwrd), pwdvalue);
	}
	

	/***********************************************************************
	 * Name : Dropdown	  
	 * @return as WebDriver
	 *  ReturnType: void	 
	 ***********************************************************************/	
	public void Mdy(String monthvalue, String dayvalue, String yearvalue) throws Exception {

		ObjectCreationClass.ComLiB
				.selectOnparam(GetBrowserElement.getWebElementByXpath(FacebookHomePageRepository.month), monthvalue);
		ObjectCreationClass.ComLiB.selectOnparam(GetBrowserElement.getWebElementByXpath(FacebookHomePageRepository.day),
				dayvalue);
		ObjectCreationClass.ComLiB
				.selectOnparam(GetBrowserElement.getWebElementByXpath(FacebookHomePageRepository.year), yearvalue);

	}
	
	
	/***********************************************************************
	 * Name : Radiobutton	  
	 * @return as
	 * ReturnType: void	 
	 ***********************************************************************/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
