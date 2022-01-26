package seleniumpro;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.LinkedListMultimap;

public class snapdd 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.snapdeal.com/?utm_term=437025299421_104151711009_%7Bbidstrategy%7D&gclid=Cj0KCQiA-qGNBhD3ARIsAO_o7ykvOOKL7jTazPH4_sxiz_ECOFFDCvCDX9TJgcgFbequK4xvneRo4acaAhU2EALw_wcB&utm_campaign=brand_account_brandcat_cpt_1d_ftu&utm_source=earth_sembrand&utm_medium=snapdeal");
       	d.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("iphone");
       	d.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
      
       	List<WebElement> h=d.findElements(By.xpath("//p[@class='product-title']"));
       
        List<String> q=new LinkedList();
       for(int i=0;i<h.size();i++)
       {
    	   WebElement se=h.get(i);
    	   String jo=se.getText();
    	   q.add(jo);
    	   
       } 
     Collections.sort(q);
      
     Set<String> qv=new TreeSet<>();
        qv.addAll(q);
        for(String q4:qv)
        {
        	System.out.println(q4);
        }
       
      	List<WebElement> h1=d.findElements(By.xpath("//span[@class='lfloat product-price']"));
      	List<String> i2=new LinkedList();
      	for(int i=0;i<h1.size();i++)
      	{
      		WebElement i3=h1.get(i);
      		String a5=i3.getText();
      		i2.add(a5);
      	}
       	Set<String> l7=new TreeSet<>();
       	l7.addAll(i2);
       	for(String l8:l7)
       	{
       		System.out.println(l8);
       	}
       	HashMap<String,String> y6=new HashMap<>();
      
	}

}
