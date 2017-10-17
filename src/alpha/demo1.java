package alpha;

import org.apache.logging.log4j.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class demo1 {
	
	private static Logger log= LogManager.getLogger(demo1.class.getName());

	
	@Test
	public void method1() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Documents\\Tutirial notes\\geckodriver.exe");	
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		log.info("site open");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		
		log.info("clicked on button");
		
	//	System.out.println(driver.switchTo().alert().getText());
		
		log.info(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept(); //dismiss to cancel
		
		log.info("Accepted the alert");
		
		log.fatal("If any fatal error");
		log.error("If any Error ");
        log.debug("Debugging");
        
	}
	

}
