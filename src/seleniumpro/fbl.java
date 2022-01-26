 package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbl  {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
		WebDriver r=new ChromeDriver();
		r.get("https://www.facebook.com/");
		String a=r.getTitle();
		String b=r.getCurrentUrl();
		System.out.println(a);
		System.out.println(b);
		WebElement d=r.findElement(By.xpath("//input[@data-testid='royal_email']"));
		d.sendKeys("mugu22@gmail.com");
		WebElement di=r.findElement(By.xpath("//input[@data-testid='royal_pass']"));
        di.sendKeys("1234567890");
        WebElement de=r.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
        de.click();
		r.close();
		r.quit();
		

}
}
