package websiteopeningindifferenbrowser;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Functionltestsctipt 
{
	LocalDateTime ldt=LocalDateTime.now();
	String date=ldt.toString().replace(":", "-");
	@Test
	public void function() throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(" https://demo.dealsdray.com/");
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='chevron_right']")).click();
		driver.findElement(By.xpath("//span[text()='Orders']")).click();
		driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//input[@type='file']"));
		element.sendKeys("C:\\Users\\Venkat\\Downloads\\demo-data.xlsx");
		driver.findElement(By.xpath("//button[text()='Import']")).click();
		driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./\\functionalscreenshot/"+"Automation Test 02 - Functional Testing Case"+date+"Screenshot.png");
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(2000);
		driver.close();
	}

}
