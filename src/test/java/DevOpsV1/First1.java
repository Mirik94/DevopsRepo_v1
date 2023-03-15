package DevOpsV1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First1 {
	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\v-mirsha.EUROPE\\eclipse-workspace\\com.DevopsProjectV1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//launch browser
		driver.get("https://www.edureka.co/");
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//click on Courses button
		driver.findElement(By.cssSelector("a.ga_courses_click")).click();
		
		//quit browser
		driver.quit();

	}
}
