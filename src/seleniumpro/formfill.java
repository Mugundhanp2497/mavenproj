package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class formfill {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		d.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("mugundhan");
		d.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("perumal");
		d.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("53,neyveli,cuddalore dist pn 607103");
		WebElement e=d.findElement(By.xpath("(//h1[contains(text(),Demo)])[1]"));
		System.out.println(e.getText());
		d.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
		d.findElement(By.xpath("//input[@type='email']")).sendKeys("mugu24@gmail.com");
		d.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
	}

}
