package orgs.zoomCar.zoomcar.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {

	public static ChromeDriver driver;
	public static WebDriverWait wait;
	@BeforeMethod
	public void loginLeafTap()	{

		//Set the property
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//Launch the browser
		driver = new ChromeDriver();
		wait= new WebDriverWait(driver, 20);

		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Maximize the window
		driver.manage().window().maximize();

		//Enter the url
		driver.get("https://www.zoomcar.com/chennai/");

	}

	@AfterMethod
	public void closeLeafTap()	{
		driver.close();
	}
}
