package orgs.zoomCar.zoomcar.testCases;

import org.testng.annotations.Test;

import orgs.zoomCar.zoomcar.base.ProjectSpecificMethods;
import orgs.zoomCar.zoomcar.pages.HomePage;

public class TC001_BookACar extends ProjectSpecificMethods{
	@Test
	public void bookACar() throws InterruptedException {
		new HomePage()
		.clickStart()
		.clickThuraipakkam()
		.clickNext()
		.clickTomorrow()
		.clickNext()
		.clickDone()
		.clickDesSort()
		.getFirstCarName();
	}
}
