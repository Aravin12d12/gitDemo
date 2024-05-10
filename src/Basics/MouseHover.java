package Basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) throws IOException {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\aravind.a05\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:");
		//implicitwait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//explicitwait
		Actions a;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(null)));
			 a = new Actions(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();                                               
		}                                                                               
		   List<WebElement> dropdown1 = driver.findElements(By.id("afacf"));
			//Select h1 = new Select(dropdown1);
			//Select h2 = new Select(dropdown);
			File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C://"));
			//h1.selectByVisibleText("INTERNET");
			//h1.selectByValue("WFWE");
			
		//WebElement move = driver.findElement(By.id("nav-link-accountList"));
		//a.moveToElement(move).build().perform();
		//h1.selectByIndex(2);
		
		//a1.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		//screenshot
		//ExtentReports reports = new ExtentReports();
		//ExtentSparkReporter reporter = new ExtentSparkReporter();
		//File src =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("D:\\drivers"));
	
	}

}
