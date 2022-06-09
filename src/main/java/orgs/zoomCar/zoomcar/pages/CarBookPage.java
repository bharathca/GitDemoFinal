package orgs.zoomCar.zoomcar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import orgs.zoomCar.zoomcar.base.ProjectSpecificMethods;

public class CarBookPage extends ProjectSpecificMethods{
	
	public CarBookPage clickDesSort() throws InterruptedException	{
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[text()=' Price: High to Low ']"))));
		driver.findElement(By.xpath("//div[text()=' Price: High to Low ']")).click();
		return this;
	}
	
	public CarBookPage getFirstCarName() throws InterruptedException	{
		Thread.sleep(3000);
		String mahindraScorpio = driver.findElement(By.xpath("(//div[@class='details']//h3)[1]")).getText();
		System.out.println(mahindraScorpio);
		return this;
	}
	

}
