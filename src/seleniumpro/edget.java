package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class edget {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\driver\\msedgedriver.exe");
		WebDriver Driver=new EdgeDriver();
		Driver.get("https://www.facebook.com/");
		String a=Driver.getCurrentUrl();
		String b=Driver.getTitle();
		System.out.println(a);
		System.out.println(b);
		WebElement d=Driver.findElement(By.id("email"));
		d.sendKeys("mugu22@gmail.com");
		WebElement di=Driver.findElement(By.name("pass"));
        di.sendKeys("1234567890");
        WebElement de=Driver.findElement(By.xpath("//button[@type='submit']"));
        de.click();
        
        Driver.close();
		
	}

}
