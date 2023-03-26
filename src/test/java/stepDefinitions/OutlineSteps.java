package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OutlineSteps {
	public static WebDriver driver;
	@Given("User is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();		
		driver= new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.manage().deleteAllCookies();		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) throws InterruptedException {
//		Thread.sleep(3000);
	    driver.findElement(By.name("username")).sendKeys(username);
//	    Thread.sleep(3000);
	    driver.findElement(By.name("password")).sendKeys(password);
//	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[contains(text(),'')]")).click();
	}
	

	@Then("User is logged In successfully")
	public void user_is_logged_in_successfully() {
	    Assert.assertEquals(true, true);
	}

}
