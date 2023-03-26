package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class allHooks {

	
	@Before(order=1, value="@smoke")
	public void setup() {
		System.out.println("initialization of browser for smoke");
	}
	
	@After(order=1, value="@smoke")
	public void tearDown() {
		System.out.println("close browser for smoke");
	}
	@Before(order=2, value="@sanity")
	public void setup2() {
		System.out.println("initialization of browser for sanity");
	}
	
	@After(order=2,value="@sanity")
	public void tearDown2() {
		System.out.println("close browser for sanity");
	}
	
	@BeforeStep(order=1)
	public void clearCache() {
		System.out.println("cache cleared");
	}
	@BeforeStep(order=2)
	public void dataBaseConnection() {
		System.out.println("cache cleared");
	}
	
	@AfterStep(order=1)
	public void clearText() {
		System.out.println("texted cleared");
	}
	@AfterStep(order=2)
	public void disconnectDataBase() {
		System.out.println("texted cleared");
	}
}
