package websiteopeningindifferenbrowser;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class FireFOX 
{
	LocalDateTime ldt=LocalDateTime.now();
	String date=ldt.toString().replace(":", "-");
	@Test
	public void resoultion19201080()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		driver.manage().window().setSize(new Dimension(1920,1080));
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./\\Screenshotfirefox/"+"desktop"+"resolution1920×1080"+date+"Screenshot.png");
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();		
		}
	
	@Test
	public void resoultion1366768()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		driver.manage().window().setSize(new Dimension(1366,768));
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./\\Screenshotfirefox/"+"desktop"+"resolution1366×768"+date+"Screenshot.png");
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();		
		}
	@Test
	public void resoultion1536864 ()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		driver.manage().window().setSize(new Dimension(1536,864));
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./\\Screenshotfirefox/"+"desktop"+"resolution1536×864 "+date+"Screenshot.png");
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();		
		}
	
		
		
	}


