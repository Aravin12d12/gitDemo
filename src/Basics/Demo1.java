package Basics;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demo1 {

	public static void main(String[] args){
//		WebDriverManager.chromedriver().setup();
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\aravind.a05\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>it = windows.iterator();

		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);

	}

}
