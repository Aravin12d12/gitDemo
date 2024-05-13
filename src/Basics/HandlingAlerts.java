package Basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingAlerts {
public void getdata() {
	System.out.println("Downloads");
}
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\aravind.a05\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Aravind");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		//screenshot
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://sdfsdfsd"));
		

	}

}
