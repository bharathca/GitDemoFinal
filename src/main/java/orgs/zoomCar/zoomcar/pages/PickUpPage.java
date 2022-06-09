package orgs.zoomCar.zoomcar.pages;

import org.openqa.selenium.By;

import orgs.zoomCar.zoomcar.base.ProjectSpecificMethods;

public class PickUpPage extends ProjectSpecificMethods{

	public PickUpPage clickTomorrow() {
		driver.findElement(By.xpath("(//div[@class='day low-price'])[1]")).click();
		return this;
	}
	
	public DropOffPage clickNext() {
		driver.findElement(By.tagName("button")).click();
		return new DropOffPage();
	}
}
