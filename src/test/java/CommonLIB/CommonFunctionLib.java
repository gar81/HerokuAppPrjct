package CommonLIB;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CommonFunctionLib {
	public static  RemoteWebDriver driver;
	private static String previuosDomproperty=null;
	private static String AfterDomproperty=null;
	private static int i=0;
	/***********************************************************************
	 * Name :FocusOnUrl 
	 * Return type: void
	 * @throws Exception 
	 **********************************************************************/
	public  void FocusOnUrl(String strurl) throws Exception{
		GetBrowserElement.getJavascriptExecuter().executeScript("window.focus();");
		GetBrowserElement.getDriver().get(strurl);
		GetBrowserElement.getDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		GetBrowserElement.PageReadyStateCheck(3000);

	}
	/*******************************************************************
	 *  FunctionName: ClickObject
	 * Argument : WebElement
	 * @throws Exception 
	 * @throws IOException 
	 ********************************************************************/
	public void ClickObject(WebElement ele) throws Exception {
		previuosDomproperty = GetBrowserElement.getDriver().getPageSource().toString();

		ele.click();
		GetBrowserElement.PageReadyStateCheck(3000);
		AfterDomproperty = GetBrowserElement.getDriver().getPageSource().toString();

		while (previuosDomproperty.equals(AfterDomproperty)) {
			GetBrowserElement.getJavascriptExecuter().executeScript("arguments[0].click();", ele);
			AfterDomproperty = "";
			AfterDomproperty = GetBrowserElement.getDriver().getPageSource().toString();
			if (i == 3) {
				GetBrowserElement.getJavascriptExecuter().executeScript("arguments[0].click();", ele);
				previuosDomproperty = null;
				AfterDomproperty = null;
				i = 0;
				Assert.assertTrue(false, "click on Object is failed");
				break;
			}
			i++;

		}
		previuosDomproperty = null;
		AfterDomproperty = null;
		i = 0;
	}

	/************************************************
	 * FunctionName: SetOnparam
	 * Argument : 
	 * 
	 *************************************************/
	public void SetOnparam(WebElement element,String strtestdata)  {
		try {

			if (!strtestdata.equals("")) {
				element.click();
				element.clear();
				element.sendKeys(strtestdata);

				Assert.assertTrue(true,"Typing is Successfull");
			}else {

				Assert.assertTrue(false,"testdata is missing");
			}

		}catch(Exception ex) {
			
			Assert.assertTrue(false,"Exception is "+ ex.toString() + " for causing :" + ex.getMessage());
		}	
	}	
	

	/************************************************
	 * FunctionName: SelectOnparam
	 * Argument : WebElements
	 * 
	 *************************************************/
	public void selectOnparam(WebElement element,String strVisiableText)  {
		try {

			if (!strVisiableText.equals("")) {
				Select select = new Select(element);
				select.selectByVisibleText(strVisiableText.trim());
				WebElement SelectEelement= select.getFirstSelectedOption();
				String SelectedValue =SelectEelement.getText().toString();
				if(SelectedValue.trim().compareTo(strVisiableText.trim())==0){
					Assert.assertTrue(true,strVisiableText+" is selected");
				}else {
					Assert.assertTrue(true,strVisiableText+" is not selected. Please check once!");
				}			
				
				Assert.assertTrue(true,"Typing is Successfull");
			}else {

				Assert.assertTrue(false,"testdata is missing");
			}

		}catch(Exception ex) {
			
			Assert.assertTrue(false,"Exception is "+ ex.toString() + " for causing :" + ex.getMessage());
		}	
	}


/************************************************
 * FunctionName: SelectOnparam1
 * Argument : WebElements
 * 
 *************************************************/
	public void selectOnparam1(WebElement element, String value) {
		try {
			Select select = new Select(element);
			select.selectByVisibleText(value);
		}

		catch (Exception ex) {
			Assert.assertTrue(false, "Exception is " + ex.toString() + " for causing :" + ex.getMessage());
		}		
	}
}
