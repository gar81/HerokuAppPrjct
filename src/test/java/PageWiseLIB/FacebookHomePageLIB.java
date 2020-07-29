package PageWiseLIB;

import CommonLIB.GetBrowserElement;
import CommonLIB.ObjectCreationClass;
import Repositories.FacebookHomePageRepository;

public class FacebookHomePageLIB {
	
	public void info(String uname, String pwd) throws Exception {
		ObjectCreationClass.ComLiB.SetOnparam(GetBrowserElement.getWebElementByXpath(FacebookHomePageRepository.email), uname);
		ObjectCreationClass.ComLiB.SetOnparam(GetBrowserElement.getWebElementByXpath(FacebookHomePageRepository.passwrd), pwd);
}}
