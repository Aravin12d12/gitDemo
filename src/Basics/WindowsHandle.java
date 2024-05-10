package Basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\aravind.a05\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//body/a")).click();
		Set<String> windows =  driver.getWindowHandles();
		Iterator<String> it =   windows.iterator();
		String parent = it.next();
		String child =  it.next();
		driver.switchTo().window(child);
		String emailid = driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys(emailid);
	}
	

}
