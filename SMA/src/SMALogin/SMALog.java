package SMALogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SMALog {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		      		
		driver.get("https://sma-fe-ms-vmwe4oziqq-el.a.run.app/");
		
        driver.manage().window().maximize();
               
       WebElement emailid= driver.findElement(By.name("username"));
       emailid.sendKeys("bhuvanesh.resoluteai@gmail.com");
       Thread.sleep(1000);      
       
       WebElement password=driver.findElement(By.name("password"));
       password.sendKeys("bhuvan@123");
       Thread.sleep(1000);
       
       WebElement signin=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/form/div[2]/div[2]"));
       signin.click();
       
       Thread.sleep(4000);
                 
       
       WebElement mngclient=driver.findElement(By.xpath("//span[normalize-space()='Manage Clients']"));
       mngclient.click();
       
       Thread.sleep(2000);
       
       WebElement addclient =driver.findElement(By.xpath("//span[@class='addBtnText']"));
       addclient.click();
       
       Thread.sleep(2000);
       
       WebElement newclient=driver.findElement(By.name("name"));
       newclient.sendKeys("Fathima");
       Thread.sleep(2000);
       
       WebElement company=driver.findElement(By.name("company_name"));
       company.sendKeys("ABC");
       
      Thread.sleep(2000);
      
      WebElement email=driver.findElement(By.name("email"));
      email.sendKeys("fathima.resoluteai@gmail.com");
      Thread.sleep(2000);
      
      WebElement mobnumber=driver.findElement(By.name("phone_number"));
      mobnumber.sendKeys("9876543210");
      Thread.sleep(2000);
      
      WebElement GSTINnum=driver.findElement(By.name("gstin_number"));
      GSTINnum.sendKeys("22AAAAA0000A1Z5");
      Thread.sleep(2000);

      WebElement add=driver.findElement(By.name("address"));
      add.sendKeys("Chennai");    
      Thread.sleep(2000);
      
      WebElement pincode=driver.findElement(By.name("pincode"));
      pincode.sendKeys("673322");
      Thread.sleep(2000);
      
      WebElement submitbtn=driver.findElement(By.xpath("//button[contains(@type,'Submit')]"));
      submitbtn.click();
      Thread.sleep(2000);
     
     // driver.quit();
      
       
      
       
      
       
     
       
       
       
       
                                       
	}

}
