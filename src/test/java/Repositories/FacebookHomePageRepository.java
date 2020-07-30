package Repositories;

import org.openqa.selenium.By;

public class FacebookHomePageRepository {
	//LOCATORS FOR LOGIN FEATURE ON FACEBOOK HOMEPAGE
	public static By email=By.xpath("//input[@id='email']");
	public static By passwrd=By.xpath("//input[@id='pass']");
	
	//LOCATORS FOR DROPDOWN FEATURE ON FACEBOOK HOMEPAGE
	public static By month=By.id("month");
	public static By day=By.id("day");
	public static By year=By.id("year");	
}
