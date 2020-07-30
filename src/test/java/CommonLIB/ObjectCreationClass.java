package CommonLIB;

import PageWiseLIB.CheckOutPageLIB;
import PageWiseLIB.FacebookHomePageLIB;
import PageWiseLIB.Hero2ContextMenuPageLIB;
import PageWiseLIB.HeroHomePageLIB;
import PageWiseLIB.HomePageLIB;
import PageWiseLIB.SearchDeatailsPageLIB;

public class ObjectCreationClass{
	 public static CommonFunctionLib ComLiB = new CommonFunctionLib();	 
	 
	 //FOR AUTOMATIONPRACTICE
	 public static HomePageLIB HomePD= new HomePageLIB();
	 public static SearchDeatailsPageLIB SearchD= new SearchDeatailsPageLIB();
	 public static CheckOutPageLIB ChecKOut= new CheckOutPageLIB();
	 
	 //FACEBOOK HOMEPAGE
	 public static FacebookHomePageLIB fc= new FacebookHomePageLIB();
	 
	 //HERO HOMEPAGE
	 public static HeroHomePageLIB hb= new HeroHomePageLIB();
	 
	//HEROCONTEXTMENU PAGE
	 public static Hero2ContextMenuPageLIB cb= new Hero2ContextMenuPageLIB();
	 
}
