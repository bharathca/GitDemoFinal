package orgs.zoomCar.zoomcar.pages;

import org.openqa.selenium.By;

import orgs.zoomCar.zoomcar.base.ProjectSpecificMethods;

public class DropOffPage extends ProjectSpecificMethods{

	public CarBookPage clickDone() {
		driver.findElement(By.tagName("button")).click();
		return new CarBookPage();
	}
}
