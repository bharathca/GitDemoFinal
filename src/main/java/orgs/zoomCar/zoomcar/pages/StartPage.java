package orgs.zoomCar.zoomcar.pages;

import org.openqa.selenium.By;

import orgs.zoomCar.zoomcar.base.ProjectSpecificMethods;

public class StartPage extends ProjectSpecificMethods{

	public StartPage clickThuraipakkam() {
		driver.findElement(By.xpath("(//div[@class='items'])[1]")).click();
		return this;
	}
	
	public PickUpPage clickNext() {
		driver.findElement(By.tagName("button")).click();
		return new PickUpPage();
	}
}
