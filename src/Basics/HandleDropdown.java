package Basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\aravind.a05\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// static dropdown
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s = new Select(dropdown);
		Thread.sleep(2000);
		s.selectByIndex(2);
		s.selectByVisibleText("fdf");
		// adding dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for (int i = 0; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			

		}
		driver.findElement(By.id("btnclosepaxoption")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[value='MAA']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		// Autosuggestive dropdown
		driver.findElement(By.id("autosuggest")).sendKeys("in");
		Thread.sleep(4000);
		List<WebElement> objects = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		
		for(WebElement objects1 : objects) {
			if(objects1.getText().equalsIgnoreCase("India")){
				objects1.click();
				break;
			}
		}
		//screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("D://"));
		

	}

}
