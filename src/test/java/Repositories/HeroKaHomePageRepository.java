package Repositories;

import org.openqa.selenium.By;

public class HeroKaHomePageRepository {
	public static By ContextMenu=By.xpath("//a[starts-with(text(), 'Context Menu')]");
	public static By BrokenImagesLink=By.xpath("//a[starts-with(text(), 'Broken Images')]");
	public static By DragDropLink=By.xpath("//a[starts-with(text(), 'Drag and Drop')]");
	public static By HorizontalSliderLink=By.xpath("//a[starts-with(text(), 'Horizontal Slider')]");	
}
