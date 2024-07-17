package Step_Defenaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class admin_adding {
	
	static	WebDriver react;
	@Given("admin is on login page")
	public void admin_is_on_login_page() {
		System.out.println("admin is tying to login in");
		react = new FirefoxDriver();
//		react.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		react.get("http://localhost:3000");
		react.findElement(By.xpath("//a[normalize-space()='Login']")).click();
	
	}

	@When("admin enters valid {string}, {string}")
	public void user_enters_valid(String string, String string2) throws InterruptedException {
		Thread.sleep(1000);
		react.findElement(By.id("email")).sendKeys(string);;
		react.findElement(By.id("password")).sendKeys(string2);;
	}

	@When("clicks on logins button")
	public void clicks_on_login_button() throws InterruptedException {
		Thread.sleep(1000);
		react.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
	}

	@Then("admin is navigated to the admim dashbord")
	public void admin_is_navigated_to_the_admim_dashbord() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(react.findElements(By.xpath("//h2[normalize-space()='Welcome Admin.....']")).size()>0, "user was navigated into home page");

	}

	@Then("click curu button")
	public void click_curu_button() throws InterruptedException {
		Thread.sleep(1000);	
		react.findElement(By.xpath("//a[normalize-space()='CRUD']")).click();

	    // //
	
	}

	@Then("check in crud component")
	public void check_in_crud_component() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(react.findElements(By.xpath("//h2[normalize-space()='This is ProductDashboard Component']")).size()>0, "user was navigated into home page");
	   ////

	}

	@Then("click add button")
	public void click_add_button() {
		react.findElement(By.xpath("//a[@href='/Maindashboard/AdminAdd']")).click();
	}

	@Then("admin in check in add component")
	public void admin_in_check_in_add_component() {
		Assert.assertTrue(react.findElements(By.xpath("//button[normalize-space()='Add Data']")).size()>0, "user was navigated into home page");
	}


	@When("admin in adding the products {string},{string},{string}")
	public void admin_in_adding_the_products(String string, String string2, String string3) {
		react.findElement(By.xpath("//input[@id=':r5:']")).sendKeys(string);;
		react.findElement(By.xpath("//input[@id=':r7:']")).sendKeys(string2);;
		react.findElement(By.xpath("//input[@id=':r9:']")).sendKeys(string3);;
	}

	@When("Click foodadd button")
	public void click_foodadd_button() throws InterruptedException {
		react.findElement(By.xpath("//button[normalize-space()='Add Data']")).click();
		Thread.sleep(2000);
		react.switchTo().alert().accept();
		Assert.assertTrue(true);
	}

//	@Then("checking adding product in check in dashbord component")
//	public void checking_adding_product_in_check_in_dashbord_component() {
//		Assert.assertTrue(true);
//	}
	
	@Then("Close the browserses")
	public void close_the_browserses() {
		 react.close();
	}

}
