package Step_Defenaction;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObject.SignIn;
//import PageObjects.SignIn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POMDesignOrganicStep {
	SignIn signin;
	WebDriver react;
	@Given("user is on sign in  page")
	public void user_is_on_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
	  react =  new FirefoxDriver();
	  react.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	  react.get("http://localhost:3000/Login");
	}

	@When("user enters a valid {string} and {string}")
	public void user_enters_a_valid_and(String EmailAddress, String password) {
	    // Write code here that turns the phrase above into concrete actions
			signin = new SignIn(react);
			signin.EmailAddress(EmailAddress);
			signin.enterPassword(password);
	}

	@And("clicks on sign in page")
	public void clicks_on_sign_in_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(8000);
	    signin.hitSigninButton();
	}

	@Then("user is navigated to the admin dashboard page")
	public void user_is_navigated_to_the_admin_dashboard_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  
	  signin.isDashBoardDisplayed();
	}

	@Then("user  click on CRUD button")
	public void user_click_on_crud_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(8000);
	   signin.hitCRUD();
	}

//	@Then("user click on Delete icon")
//	public void user_click_on_delete_icon() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(5000);
//	   signin.CRUDdelete();
//	}

	@Then("user click on back button")
	public void user_click_on_back_button1() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
	  signin.CRUDback();
	}

	@Then("user click on Manage Users")
	public void user_click_on_manage_users() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(8000);
	  signin.hitManageUsers();
	}

	@Then("user click on Products")
	public void user_click_on_products() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(8000);
	    signin.hitProducts();
	}

	@Then("user click on Add to cart")
	public void user_click_on_add_to_cart() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(8000);
	    signin.ProductsCart();
	}

	@Then("User click on back button")
	public void user_click_on_back_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(8000);
	  signin.productsback();
	}

	@Then("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    react.close();
	}

}
