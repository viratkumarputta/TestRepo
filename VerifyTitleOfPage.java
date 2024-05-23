package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleOfPage {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	        driver.findElement(By.id("Email")).clear();
	        driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");	        
	        driver.findElement(By.id("Password")).clear();
	        driver.findElement(By.id("Password")).sendKeys("admin");
	        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
	        Thread.sleep(5000);
	        
	        // to get the tile of the page
	        String a= driver.getTitle();
	        System.out.println(a);
	        
	        // to verify the equality of two strings in java
	        System.out.println(a.contentEquals("Dashboard / nopCommerce administration"));
          
	        driver.close(); 

	}

}
