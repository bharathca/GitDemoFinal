package orgs.zoomCar.zoomcar.pages;

import org.openqa.selenium.By;

import orgs.zoomCar.zoomcar.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	public StartPage clickStart() {
		driver.findElement(By.linkText("Start your wonderful journey")).click();
		return new StartPage();
	}
}
