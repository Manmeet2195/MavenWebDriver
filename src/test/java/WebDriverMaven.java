import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebDriverMaven {
	
	@Test
	public void doLogin(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		driver.findElement(By.id("identifierId")).sendKeys("jimmy06c206@gmail.com");
		//driver.findElement(By.id("nextiId")).click();
		
		
		driver.quit();
		
	}
}
		
		