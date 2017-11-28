package newUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class userSingon {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\RaulArturoDzulRios\\Documents\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");	
		
		//Enter sign on  page
		WebElement singon = driver.findElement(By.linkText("REGISTER"));
		singon.click();	

		//New credentials
		WebElement fname = driver.findElement(By.name("firstName"));
		fname.sendKeys("Raul");
		WebElement lname = driver.findElement(By.name("lastName"));
		lname.sendKeys("Dzul");
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("9998765432");
		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("raul@mail.com");
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("home #566");
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Merida");
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("Yucatan");
		WebElement code = driver.findElement(By.name("postalCode"));
		code.sendKeys("97455");
		WebElement user = driver.findElement(By.name("email"));
		user.sendKeys("raul26");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("testing123");
		WebElement pass2 = driver.findElement(By.name("password"));
		pass2.sendKeys("testing123");	
		
		//Submit
		WebElement submit = driver.findElement(By.name("register"));
		submit.submit();
	}
}
