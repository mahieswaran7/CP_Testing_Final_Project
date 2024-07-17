package Step_Defenaction;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_step {
	
static	WebDriver react;


@Given("User is on login page")
public void user_is_on_login_page() {
	System.out.println("User is tying to login in");
	react = new FirefoxDriver();
	react.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	react.get("http://localhost:3000");
	react.findElement(By.xpath("//a[normalize-space()='Login']")).click();
	
	
}

@And("User entersss valid {string} and {string}")
public void user_entersss_valid_and(String username, String passwords) {
	react.findElement(By.id("email")).sendKeys(username);;
	react.findElement(By.id("password")).sendKeys(passwords);;
}

@When("clicks on login buttonssss")
public void clicks_on_login_buttonssss() {
	react.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
	assertTrue(true);
}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() throws InterruptedException {
//	 Assert.assertTrue(react.findElement(By.id("button-73")), "user was navigated into home page");
// Assert.assertTrue(true);
//	Thread.sleep(1000);
	Assert.assertTrue(react.findElements(By.xpath("//p[normalize-space()='CartItems-(0)']")).size()>0, "user was navigated into home page");
}

@Then("Close the browsersss")
public void close_the_browsersss() {
	 react.close();
}







}
