import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;


public class opencart_opera {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
    /*System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
    WebDriver driver= new FirefoxDriver();*/
	
	/*System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();*/
		
    System.setProperty("webdriver.opera.driver","C:\\Program Files\\Opera\\43.0.2442.1144\\operadriver.exe");
	WebDriver driver= new OperaDriver();	
		
    driver.get("https://demo.opencart.com/");
    
    Actions builder = new Actions(driver);
    WebElement element = driver.findElement(By.linkText("Desktops"));
    
    builder.moveToElement(element).build().perform();
    driver.findElement(By.linkText("Mac (1)")).click();
    driver.findElement(By.linkText("iMac")).click();
    driver.findElement(By.id("button-cart")).click();
    driver.findElement(By.id("cart-total")).click();
    driver.findElement(By.xpath("//a[@href='https://demo.opencart.com/index.php?route=checkout/cart']")).click();
    
	
	



	}

}
