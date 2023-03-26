package stepDefinitions;

import java.io.ObjectInputFilter.Config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class stepDemo2 {
	public static WebDriver driver;

	@Before()
	public void setup() {
		System.out.println("initialization of browser for smoke");
	}
	
	@After()
	public void tearDown() {
		System.out.println("close browser for smoke");
	}
	@BeforeStep()
	public void setup2() {
		System.out.println("Before step executed");
	}
	
	@AfterStep()
	public void tearDown2() {
		System.out.println("After step executed");
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();		
		driver= new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.manage().deleteAllCookies();		
		driver.get("https://demo.guru99.com/Agile_Project/Agi_V1/");
	}

	@When("user enters valid creds")
	public void user_enters_valid_creds() {	
	   driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("1303");
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Guru99");
	   driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	}

//	@Then("user is able to login")
//	public void user_is_able_to_login() {
//		String expURL= "https://demo.guru99.com/Agile_Project/Agi_V1/customer/Customerhomepage.php";
//		String actURL= driver.getCurrentUrl();
//	   Assert.assertEquals(expURL,actURL);
//	}
	@Given("user is on login")
	public void user_is_on_login() {
	   System.out.println("login to app");
	}

	@When("user clicks on payment link")
	public void user_clicks_on_payment_link() {
		 System.out.println("clicked on link");
	}

	@Then("user lands on payment page")
	public void user_lands_on_payment_page() {
		 System.out.println("landed on next page");
	}
	
}
