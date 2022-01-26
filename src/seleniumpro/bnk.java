package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bnk {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.findElement(By.xpath("//input[@dir='auto']")).sendKeys("iphone");
		d.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
	}

}
