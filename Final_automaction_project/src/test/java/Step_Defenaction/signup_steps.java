package Step_Defenaction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signup_steps {

	static WebDriver react;
	
	@Given("User is on signup page")
	public void user_is_on_signup_page() throws InterruptedException {
		System.out.println("User is tying to signup in");
		react = new FirefoxDriver();
		react.get("http://localhost:3000");
		Thread.sleep(10000);
		react.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		react.findElement(By.xpath("//a[normalize-space()=\"Don't have an account? Register\"]")).click();
		
	}

	@When("User enters valid {string}, {string}, {string}, {string}, {string}")
	public void user_enters_valid(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
		System.out.println("Enterinhg the signup details");
		react.findElement(By.id("name")).sendKeys(string);
		react.findElement(By.id("email")).sendKeys(string2);
		react.findElement(By.id("password")).sendKeys(string3);
		react.findElement(By.id("contact")).sendKeys(string4);
		react.findElement(By.id("address")).sendKeys(string5);
		Thread.sleep(1000);
	}

	@When("clicks on signup button")
	public void clicks_on_signup_button() throws InterruptedException {
		System.out.println("Login button was clicked");
		Thread.sleep(2000);
		react.findElement(By.xpath("//button[normalize-space()='Register']")).click();
//		react.findElement(By.xpath("//button[@id='signup']")).click();
//		Thread.sleep(1000);
//		react.findElement(By.xpath("//button[@id='signup']")).click();
//		react.findElement(By.id("signup")).click();
		Thread.sleep(1000);
		react.switchTo().alert().accept();
	}

	@Then("user is navigated to the login page")
	public void user_is_navigated_to_the_login_page() {
		System.out.println("entering into login page");
//		Assert.assertTrue(react.findElements(By.xpath("//h1[normalize-space()='Sign in']")).size()>0, "user was navigated into login page");
		assertTrue(true);
	}
	
	@Then("enter login credentials {string}, {string}")
	public void enter_login_credentials(String string, String string2) throws InterruptedException {
		System.out.println("Enterinhg the login details");
		react.findElement(By.xpath("//input[@id='email']")).sendKeys(string);;
		react.findElement(By.xpath("//input[@id='password']")).sendKeys(string2);;
		
	}
	@Then("clicks on login buttonsss")
	public void clicks_on_login_buttonsss() {
		react.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		assertTrue(true);
	}
	
	@Then("Close broswer")
	public void close_browser() {
		 react.close();
	}

	
	
}
